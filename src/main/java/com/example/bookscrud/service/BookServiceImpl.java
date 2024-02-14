package com.example.bookscrud.service;

import com.example.bookscrud.entity.BookEntity;
import com.example.bookscrud.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService{

    @Autowired
    private BookRepository bookRepository;

    @Override
    public List<BookEntity> getAllBooks() {
        return bookRepository.findAll();
    }
}
