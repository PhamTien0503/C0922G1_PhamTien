package com.blog_app.service;

import com.blog_app.model.Blog;
import com.blog_app.model.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IBlogService {
    Page<Blog> findAll(Pageable pageable);
    Blog findById(int id);
    boolean save(Blog blog);
    boolean remove(int id);
    boolean update(Blog blog);
    Page<Blog>findBlogByCategory_Id(int id,Pageable pageable);
    Page<Blog>findBlogByNameContaining(String name,Pageable pageable);
}
