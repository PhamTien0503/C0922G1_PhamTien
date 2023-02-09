package com.form_register.service;

import com.form_register.model.Song;

import java.util.List;

public interface ISongService {
    List<Song> findAll();
    boolean save(Song user);
    Song findById(int id);
}
