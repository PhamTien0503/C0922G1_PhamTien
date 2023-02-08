package com.blog_app.service;

import com.blog_app.model.Blog;
import com.blog_app.model.Category;

import java.util.List;

public interface IBlogService {
    List<Blog> findAll();
    Blog findById(int id);
    boolean save(Blog blog);
    boolean remove(int id);
    boolean update(Blog blog);
}
