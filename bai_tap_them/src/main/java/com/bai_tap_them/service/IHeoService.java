package com.bai_tap_them.service;

import com.bai_tap_them.model.Heo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IHeoService {
    Page<Heo> findAll(Pageable pageable);
    Heo findById(String id);
    void save(Heo heo);
    void deleteById(String id);
}
