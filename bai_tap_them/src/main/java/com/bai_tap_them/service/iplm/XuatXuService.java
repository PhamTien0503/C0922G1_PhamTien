package com.bai_tap_them.service.iplm;

import com.bai_tap_them.model.XuatXu;
import com.bai_tap_them.repository.IXuatXuRepository;
import com.bai_tap_them.service.IXuatXuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class XuatXuService implements IXuatXuService {
    @Autowired
    private IXuatXuRepository iXuatXuRepository;
    @Override
    public List<XuatXu> findAll() {
        return iXuatXuRepository.findAll();
    }

    @Override
    public XuatXu findById(int id) {
        return iXuatXuRepository.findById(id).get();
    }
}
