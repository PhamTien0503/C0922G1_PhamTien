package com.blog_app.controller;

import com.blog_app.model.Blog;
import com.blog_app.service.IBlogService;
import com.blog_app.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@CrossOrigin("*")
@RestController
@RequestMapping("api/blog")
public class BlogRestController {
    @Autowired
    private IBlogService blogService;
    @Autowired
    private ICategoryService categoryService;

    @GetMapping("/search")
    public ResponseEntity<Page<Blog>> showSearchList(@RequestParam(required = false, defaultValue = "") String nameSearch,
                                                     @RequestParam(required = false, defaultValue = "2") int number) {
        Pageable pageable = PageRequest.of(0, number);
        Page<Blog> blogPage = blogService.findBlogByNameContaining(nameSearch, pageable);
        if (blogPage == null) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(blogPage, HttpStatus.OK);
        }
    }

    @GetMapping("/bycategory")
    public ResponseEntity<Page<Blog>> findBlogByCategory(@PageableDefault(size = 2, page = 0) Pageable pageable,
                                                         @RequestParam int id) {
        Page<Blog> blogPage = blogService.findBlogByCategory_Id(id, pageable);
        if (blogPage == null) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(blogPage, HttpStatus.OK);
        }
    }

    @GetMapping("/detail/{id}")
    public ResponseEntity<Blog> findById(@PathVariable int id) {
        Blog blog = blogService.findById(id);
        if (blog == null) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        } else {
            return new ResponseEntity<>(blog, HttpStatus.OK);
        }
    }
}
