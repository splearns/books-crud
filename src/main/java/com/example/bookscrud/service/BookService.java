package com.example.bookscrud.service;

import com.example.bookscrud.entity.BookEntity;
import org.springframework.stereotype.Service;

import java.util.List;



public interface BookService {

    public List<BookEntity> getAllBooks();

}
