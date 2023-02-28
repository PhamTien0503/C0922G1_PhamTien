package com.bai_tap_them.service.iplm;

import com.bai_tap_them.model.Heo;
import com.bai_tap_them.repository.IHeoRepository;
import com.bai_tap_them.service.IHeoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class HeoService implements IHeoService {
    @Autowired
    private IHeoRepository iHeoRepository;

    @Override
    public Page<Heo> findAll(Pageable pageable) {
        return iHeoRepository.findAll(pageable);
    }

    @Override
    public Heo findById(String id) {
        return iHeoRepository.findById(id).get();
    }

    @Override
    public void save(Heo heo) {
        iHeoRepository.save(heo);
    }

    @Override
    public void deleteById(String id) {
        iHeoRepository.deleteById(id);
    }
}
