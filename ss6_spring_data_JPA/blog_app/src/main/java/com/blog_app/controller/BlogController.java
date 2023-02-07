package com.blog_app.controller;

import com.blog_app.model.Blog;
import com.blog_app.service.IBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("blog")
public class BlogController {
    @Autowired
    private IBlogService blogService;
    @GetMapping("")
    public String showList(Model model){
        model.addAttribute("blogList",blogService.findAll());
        return "list";
    }
    @GetMapping("/create")
    public String showFormCreate(Model model){
        model.addAttribute("blog",new Blog());
        return "create";
    }
    @PostMapping("/create")
    public String save(@ModelAttribute Blog blog,Model model){
        boolean check= blogService.save(blog);
        String str="Add success!!";
        if (!check){
            str="Add failed!!!";
        }
        model.addAttribute("mess",str);
        model.addAttribute("blogList",blogService.findAll());
        return "list";
    }
}
