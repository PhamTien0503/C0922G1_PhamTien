package com.blog_app.service.iplm;

import com.blog_app.service.IBlogService;
import com.blog_app.model.Blog;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.blog_app.repository.IBlogRepository;

import java.util.List;
@Service
public class BlogService implements IBlogService {
    @Autowired
     private IBlogRepository blogRepository;
    @Override
    public List<Blog> findAll() {
        return blogRepository.findAll();
    }

    @Override
    public Blog findById(int id) {
        return null;
    }

    @Override
    public boolean save(Blog blog) {
        try {
            blogRepository.save(blog);
            return true;
        }catch (Exception e){
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean remove(int id) {
        return false;
    }

    @Override
    public boolean update(Blog blog) {
        return false;
    }
}
