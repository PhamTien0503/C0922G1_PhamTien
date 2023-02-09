package com.form_register.repository;

import com.form_register.model.Song;
import org.springframework.data.repository.CrudRepository;

public interface ISongRepository extends CrudRepository<Song,Integer> {
}
