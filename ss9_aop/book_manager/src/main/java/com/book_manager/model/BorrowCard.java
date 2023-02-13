package com.book_manager.model;

import javax.persistence.*;

@Entity
public class BorrowCard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private int code;
    @ManyToOne
    @JoinColumn (name = "book_id",referencedColumnName = "id")
    private Book book;

    public BorrowCard() {
    }

    public BorrowCard(int id, int code, Book book) {
        this.id = id;
        this.code = code;
        this.book = book;
    }
    public BorrowCard( int code, Book book) {
        this.code = code;
        this.book = book;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }
}
