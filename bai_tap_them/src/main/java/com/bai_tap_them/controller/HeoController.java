package com.bai_tap_them.controller;

import com.bai_tap_them.service.IHeoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HeoController {
    @Autowired
    private IHeoService iHeoService;
    @GetMapping("")
    public String showList(Model model, @PageableDefault(page = 0,size = 5)Pageable pageable){
        model.addAttribute("heoList",iHeoService.findAll(pageable));
        return "list";
    }

}
