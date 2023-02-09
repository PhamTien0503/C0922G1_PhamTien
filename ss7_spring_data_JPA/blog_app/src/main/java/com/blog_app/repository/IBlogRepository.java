package com.blog_app.repository;

import com.blog_app.model.Blog;
import com.blog_app.model.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IBlogRepository extends JpaRepository<Blog,Integer> {
    Page<Blog>findBlogByCategory_Id(int id,Pageable pageable);
    Page<Blog>findAll(Pageable pageable);
}
