package com.book_manager.controller;

import com.book_manager.model.Book;
import com.book_manager.model.BorrowCard;
import com.book_manager.service.IBookService;
import com.book_manager.service.IBorrowCardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.Random;

@Controller
@RequestMapping("book")
public class BookController {
    @Autowired
    private IBookService bookService;
    @Autowired
    private IBorrowCardService borrowCardService;

    @GetMapping("")
    public String showList(Model model) {
        model.addAttribute("bookList", bookService.findAll());
        return "list";
    }

    @GetMapping("/borrow")
    public String showFormBorrow(Model model, @RequestParam int id) {
        model.addAttribute("book", bookService.findById(id));
        return "borrow";
    }

    @PostMapping("/update")
    public String borrowBook(Model model, @RequestParam int id, RedirectAttributes redirectAttributes) {
        Book book = bookService.findById(id);
        int number = book.getQuantity() - 1;
        if (number < 0) {
            return "errors";
        } else {
            book.setQuantity(number);
            bookService.save(book);
            model.addAttribute("bookList", bookService.findAll());
            Random random = new Random();
            int bookCode = random.nextInt(99999 - 10000 + 1) + 10000;
            BorrowCard borrowCard = new BorrowCard(bookCode, book);
            borrowCardService.save(borrowCard);
            String str = "Borrow book success with code: " + bookCode;
            redirectAttributes.addFlashAttribute("mess", str);
            return "redirect:/book";
        }
    }

    @GetMapping("giveBack")
    public String showFormGiveBack(Model model) {
        model.addAttribute("borrowCard", new BorrowCard());
        return "giveback";
    }

    @GetMapping("giveBackBook")
    public String giveBack(@RequestParam int code, Model model) {
        BorrowCard borrowCard = borrowCardService.findByCode(code);
        Book book = borrowCard.getBook();
        int number = book.getQuantity() + 1;
        book.setQuantity(number);
        bookService.save(book);
        model.addAttribute("bookList", bookService.findAll());
        String str = "give back success!!!";
        model.addAttribute("mess", str);
        return "list";
    }
    @ExceptionHandler(Exception.class)
    public String handlerException(){
        return "error";
    }
}
