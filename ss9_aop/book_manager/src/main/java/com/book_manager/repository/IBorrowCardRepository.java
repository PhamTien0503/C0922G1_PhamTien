package com.book_manager.repository;

import com.book_manager.model.BorrowCard;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IBorrowCardRepository extends JpaRepository<BorrowCard,Integer> {
    BorrowCard findByCode(int code);
}
