package com.form_register.service.iplm;

import com.form_register.model.Song;
import com.form_register.repository.ISongRepository;
import com.form_register.service.ISongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class SongService implements ISongService {
    @Autowired
    private ISongRepository songRepository;

    @Override
    public List<Song> findAll() {
        return (List<Song>) songRepository.findAll();
    }

    @Override
    public boolean save(Song user) {
        try {
            songRepository.save(user);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    @Override
    public Song findById(int id) {
        return songRepository.findById(id).get();
    }
}
