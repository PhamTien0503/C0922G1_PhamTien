package com.form_register.controller;

import com.form_register.dto.SongDto;
import com.form_register.model.Song;
import com.form_register.service.ISongService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("song")
public class SongController {
    @Autowired
    private ISongService songService;
    @GetMapping("")
    public String showList(Model model) {
        model.addAttribute("songList", songService.findAll());
        return "list";
    }

    @GetMapping("/create")
    public String showFormCreate(Model model) {
        model.addAttribute("songDto", new Song());
        return "create";
    }

    @PostMapping("/create")
    public String save(@Validated @ModelAttribute SongDto songDto, BindingResult bindingResult, Model model,
                       RedirectAttributes redirectAttributes) {
        if (bindingResult.hasErrors()) {
            model.addAttribute("songDto",songDto);
            return "create";
        }
        Song song=new Song();
        BeanUtils.copyProperties(songDto,song);
        boolean check = songService.save(song);
        String str = "Success!!";
        if (!check) {
            str = "Failed!!!";
        }
        redirectAttributes.addFlashAttribute("mess", str);
        return "redirect:/song";
    }
    @GetMapping("/update")
    public String showFormUpdate(@RequestParam int id, Model model) {
        model.addAttribute("songDto", songService.findById(id));
        return "update";
    }
}
