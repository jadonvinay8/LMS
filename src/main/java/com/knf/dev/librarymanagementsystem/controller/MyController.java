package com.knf.dev.librarymanagementsystem.controller;

import com.knf.dev.librarymanagementsystem.entity.Book;
import com.knf.dev.librarymanagementsystem.service.BookService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.Set;

@RestController
public class MyController {

    private final BookService bookService;

    public MyController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/books/{userId}")
    public Set<Book> getMyBooks(@PathVariable Long userId) {
        return bookService.findBooksByUserId(userId);
    }

}
