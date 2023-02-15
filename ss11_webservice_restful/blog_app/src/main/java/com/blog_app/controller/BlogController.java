package com.blog_app.controller;

import com.blog_app.model.Blog;
import com.blog_app.repository.ICategoryRepository;
import com.blog_app.service.IBlogService;
import com.blog_app.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("blog")
public class BlogController {
    @Autowired
    private IBlogService blogService;
    @Autowired
    private ICategoryService categoryService;

    @GetMapping("")
    public String showList(Model model, @PageableDefault(size = 2, page = 0, sort = "date", direction = Sort.Direction.DESC) Pageable pageable) {
        model.addAttribute("blogPage", blogService.findAll(pageable));
        return "blog/list";
    }

    @GetMapping("/create")
    public String showFormCreate(Model model) {
        model.addAttribute("blog", new Blog());
        model.addAttribute("categoryList", categoryService.findAll());
        return "blog/create";
    }

    @PostMapping("/create")
    public String save(@ModelAttribute Blog blog, Model model,
                       RedirectAttributes redirectAttributes) {
        boolean check = blogService.save(blog);
        String str = "Add success!!";
        if (!check) {
            str = "Add failed!!!";
        }
        redirectAttributes.addFlashAttribute("mess", str);
        return "redirect:/blog";
    }

    @GetMapping("update")
    public String showFormUpdate(@RequestParam int id, Model model) {
        model.addAttribute("categoryList", categoryService.findAll());
        model.addAttribute("blog", blogService.findById(id));
        return "blog/update";
    }

    @PostMapping("/update")
    public String update(@ModelAttribute Blog blog, Model model, RedirectAttributes redirectAttributes) {
        boolean check = blogService.update(blog);
        String str = "Update success!!";
        if (!check) {
            str = "Update failed!!!";
        }
        redirectAttributes.addFlashAttribute("mess", str);
        return "redirect:/blog";
    }

    @GetMapping("delete")
    public String showFormDelete(@RequestParam int id, Model model) {
        model.addAttribute("blog", blogService.findById(id));
        return "blog/delete";
    }

    @PostMapping("/delete")
    public String delete(@ModelAttribute Blog blog, Model model, RedirectAttributes redirectAttributes) {
        boolean check = blogService.remove(blog.getId());
        String str = "Delete success!!";
        if (!check) {
            str = "Delete failed!!!";
        }
        redirectAttributes.addFlashAttribute("mess", str);
        return "redirect:/blog";
    }

    @GetMapping("/detail")
    public String showDetail(Model model, @RequestParam int id) {
        model.addAttribute("blog", blogService.findById(id));
        return "blog/detail";
    }

}
