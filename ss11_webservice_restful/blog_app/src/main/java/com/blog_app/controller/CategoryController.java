package com.blog_app.controller;

import com.blog_app.model.Blog;
import com.blog_app.model.Category;
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

@Controller
@RequestMapping("category")
public class CategoryController {
    @Autowired
    private IBlogService blogService;
    @Autowired
    private ICategoryService categoryService;
    @GetMapping("")
    public String showList(Model model) {
        model.addAttribute("categoryList", categoryService.findAll());
        return "category/list";
    }

    @GetMapping("/create")
    public String showFormCreate(Model model) {
        model.addAttribute("category", new Category());
        return "category/create";
    }

    @PostMapping("/create")
    public String save(@ModelAttribute Category category, Model model) {
        boolean check = categoryService.save(category);
        String str = "Add success!!";
        if (!check) {
            str = "Add failed!!!";
        }
        model.addAttribute("mess", str);
        model.addAttribute("categoryList", categoryService.findAll());
        return "category/list";
    }

    @GetMapping("update")
    public String showFormUpdate(@RequestParam int id, Model model) {
        model.addAttribute("category", categoryService.findById(id));
        return "category/update";
    }

    @PostMapping("/update")
    public String update(@ModelAttribute Category category, Model model) {
        boolean check = categoryService.update(category);
        String str = "Update success!!";
        if (!check) {
            str = "Update failed!!!";
        }
        model.addAttribute("mess", str);
        model.addAttribute("categoryList", categoryService.findAll());
        return "category/list";
    }

    @GetMapping("delete")
    public String showFormDelete(@RequestParam int id, Model model) {
        model.addAttribute("category", categoryService.findById(id));
        return "category/delete";
    }

    @PostMapping("/delete")
    public String delete(@ModelAttribute Category category, Model model) {
        boolean check = categoryService.remove(category.getId());
        String str = "Delete success!!";
        if (!check) {
            str = "Delete failed!!!";
        }
        model.addAttribute("mess", str);
        model.addAttribute("categoryList", categoryService.findAll());
        return "category/list";
    }
    @GetMapping("show")
    public  String searchBlog(@RequestParam int id, Model model, @PageableDefault(size = 2, page = 0, sort = "date",direction = Sort.Direction.DESC) Pageable pageable){
        model.addAttribute("blogPage",blogService.findBlogByCategory_Id(id,pageable));
        return "blog/list";
    }
}
