package com.example.bookscrud.service;

import com.example.bookscrud.entity.BookEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


public interface BookService {

    public List<BookEntity> getAllBooks();
    BookEntity findBookById(Long Id);
    BookEntity addNewBook(BookEntity bookEntity);
    BookEntity updateBook(BookEntity bookEntity);
    void deleteBookById(Long Id);







}
