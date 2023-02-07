package com.blog_app.controller;

import com.blog_app.model.Blog;
import com.blog_app.service.IBlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("blog")
public class BlogController {
    @Autowired
    private IBlogService blogService;

    @GetMapping("")
    public String showList(Model model) {
        model.addAttribute("blogList", blogService.findAll());
        return "list";
    }

    @GetMapping("/create")
    public String showFormCreate(Model model) {
        model.addAttribute("blog", new Blog());
        return "create";
    }

    @PostMapping("/create")
    public String save(@ModelAttribute Blog blog, Model model) {
        boolean check = blogService.save(blog);
        String str = "Add success!!";
        if (!check) {
            str = "Add failed!!!";
        }
        model.addAttribute("mess", str);
        model.addAttribute("blogList", blogService.findAll());
        return "list";
    }

    @GetMapping("update")
    public String showFormUpdate(@RequestParam int id, Model model) {
        model.addAttribute("blog", blogService.findById(id));
        return "update";
    }

    @PostMapping("/update")
    public String update(@ModelAttribute Blog blog, Model model) {
        boolean check = blogService.update(blog);
        String str = "Update success!!";
        if (!check) {
            str = "Update failed!!!";
        }
        model.addAttribute("mess", str);
        model.addAttribute("blogList", blogService.findAll());
        return "list";
    }

    @GetMapping("delete")
    public String showFormDelete(@RequestParam int id, Model model) {
        model.addAttribute("blog", blogService.findById(id));
        return "delete";
    }

    @PostMapping("/delete")
    public String delete(@ModelAttribute Blog blog, Model model) {
        boolean check = blogService.remove(blog.getId());
        String str = "Delete success!!";
        if (!check) {
            str = "Delete failed!!!";
        }
        model.addAttribute("mess", str);
        model.addAttribute("blogList", blogService.findAll());
        return "list";
    }

    @GetMapping("/detail")
    public String showDetail(Model model, @RequestParam int id) {
        model.addAttribute("blog", blogService.findById(id));
        return "detail";
    }
}
