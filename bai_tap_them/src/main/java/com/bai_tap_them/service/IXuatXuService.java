package com.bai_tap_them.service;

import com.bai_tap_them.model.XuatXu;

import java.util.List;

public interface IXuatXuService {
    List<XuatXu> findAll();
    XuatXu findById(int id);
}
