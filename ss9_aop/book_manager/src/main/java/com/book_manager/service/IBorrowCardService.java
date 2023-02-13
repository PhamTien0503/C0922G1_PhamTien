package com.book_manager.service;

import com.book_manager.model.BorrowCard;

public interface IBorrowCardService{
    void save(BorrowCard borrowCard);
    BorrowCard findByCode(int code);
}
