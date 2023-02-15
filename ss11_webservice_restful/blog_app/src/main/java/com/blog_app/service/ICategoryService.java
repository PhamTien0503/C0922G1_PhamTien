package com.blog_app.service;

import com.blog_app.model.Blog;
import com.blog_app.model.Category;

import java.util.List;

public interface ICategoryService {
    List<Category> findAll();
    Category findById(int id);
    boolean save(Category category);
    boolean remove(int id);
    boolean update(Category category);
}