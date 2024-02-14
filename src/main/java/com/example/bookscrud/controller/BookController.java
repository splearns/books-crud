package com.example.bookscrud.controller;


import com.example.bookscrud.entity.BookEntity;
import com.example.bookscrud.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookController {

@Autowired
    private BookService bookService;

    @GetMapping("/getAllBooks")
    public String getAllBooks()

    {
        List<BookEntity> response = bookService.getAllBooks();
        return response.toString();
    }

}
