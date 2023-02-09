package com.form_register.controller;

import com.form_register.dto.UserDto;
import com.form_register.model.User;
import com.form_register.service.IUserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("user")
public class UserController {
    @Autowired
    private IUserService userService;
    @GetMapping("")
    public String showList(Model model) {
        model.addAttribute("userList", userService.findAll());
        return "list";
    }

    @GetMapping("/create")
    public String showFormCreate(Model model) {
        model.addAttribute("userDto", new User());
        return "create";
    }

    @PostMapping("/create")
    public String save(@Validated @ModelAttribute UserDto userDto, BindingResult bindingResult,Model model,
                       RedirectAttributes redirectAttributes) {
        if (bindingResult.hasErrors()) {
            model.addAttribute("userDto",userDto);
            return "create";
        }
        User user=new User();
        BeanUtils.copyProperties(userDto,user);
        boolean check = userService.save(user);
        String str = "Add success!!";
        if (!check) {
            str = "Add failed!!!";
        }
        redirectAttributes.addFlashAttribute("mess", str);
        return "redirect:/user";
    }
}
