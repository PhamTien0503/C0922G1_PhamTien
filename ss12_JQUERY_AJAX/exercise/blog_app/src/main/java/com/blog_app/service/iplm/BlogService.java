package com.blog_app.service.iplm;

import com.blog_app.service.IBlogService;
import com.blog_app.model.Blog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import com.blog_app.repository.IBlogRepository;

import java.util.List;

@Service
public class BlogService implements IBlogService {
    @Autowired
    private IBlogRepository blogRepository;

    @Override
    public Page<Blog> findAll(Pageable pageable) {
        return blogRepository.findAll(pageable);
    }

    @Override
    public Blog findById(int id) {
        return blogRepository.findById(id).get();
    }

    @Override
    public boolean save(Blog blog) {
        try {
            blogRepository.save(blog);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean remove(int id) {
        try {
            blogRepository.delete(findById(id));
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean update(Blog blog) {
        try {
            blogRepository.save(blog);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public Page<Blog> findBlogByCategory_Id(int id,Pageable pageable) {
        return blogRepository.findBlogByCategory_Id(id,pageable);
    }

    @Override
    public Page<Blog> findBlogByNameContaining(String name, Pageable pageable) {
        return blogRepository.findBlogByNameContaining(name,pageable);
    }
}
