package com.book_manager.service.impl;

import com.book_manager.model.BorrowCard;
import com.book_manager.repository.IBorrowCardRepository;
import com.book_manager.service.IBorrowCardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BorrowCardService implements IBorrowCardService {
    @Autowired
    private IBorrowCardRepository borrowCardRepository;
    public void save(BorrowCard borrowCard){
        borrowCardRepository.save(borrowCard);
    }

    @Override
    public BorrowCard findByCode(int code) {
        return borrowCardRepository.findByCode(code);
    }
}
