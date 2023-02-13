package com.book_manager.service;

import com.book_manager.model.Book;

import java.util.List;

public interface IBookService{
    List<Book> findAll();
    Book findById(int id);
}
