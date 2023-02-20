package com.example.furama.controller;

import com.example.furama.model.customer.Customer;
import com.example.furama.service.customer.ICustomerService;
import com.example.furama.service.customer.ICustomerTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("customer")
public class CustomerController {
    @Autowired
    private ICustomerService customerService;
    @Autowired
    private ICustomerTypeService customerTypeService;

    @GetMapping("")
    public String showList(Model model) {
        model.addAttribute("customerList", customerService.findAll());
        return "customer/list";
    }

    @GetMapping("create")
    public String showFromCreate(Model model) {
        model.addAttribute("customer", new Customer());
        model.addAttribute("customerTypeList", customerTypeService.findAll());
        String str="";
        return "customer/create";
    }

    @PostMapping("save")
    public String save(@ModelAttribute Customer customer, RedirectAttributes redirectAttributes) {
        boolean check = customerService.save(customer);
        String mess = "";
        if (check == true) {
            mess = "add success!!!";
        } else {
            mess = "add failed";
        }
        redirectAttributes.addFlashAttribute("mess", mess);
        return "redirect:/customer/create";
    }
}
