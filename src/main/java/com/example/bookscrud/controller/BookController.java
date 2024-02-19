package com.example.bookscrud.controller;


import com.example.bookscrud.entity.BookEntity;
import com.example.bookscrud.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Validated
public class BookController {

@Autowired
    private BookService bookService;

    @GetMapping("/getAllBooks")
    public ResponseEntity<List<BookEntity>> getAllBooks()
    {
        List<BookEntity> allBooks = bookService.getAllBooks();
        return new  ResponseEntity<>(allBooks, HttpStatus.OK);
    }

    @GetMapping("/getBookById/{id}")
    public ResponseEntity<BookEntity> getBookById(@PathVariable("id") Long Id) {
        BookEntity singleBook = bookService.findBookById(Id) ;
               return new ResponseEntity<>(singleBook, HttpStatus.OK);

    }


    @PostMapping("/addNewBook/{id}")
    public ResponseEntity<BookEntity> addNewBook(@RequestBody BookEntity bookEntity) {
        BookEntity savedbook = bookService.addNewBook(bookEntity);
        return new ResponseEntity<>(savedbook, HttpStatus.OK);
    }

    @PutMapping("/updateBook/{id}")

    public ResponseEntity<BookEntity> updateBook(@PathVariable("id") Long Id, @RequestBody BookEntity bookEntity)

    {
        bookEntity.setDescription(bookEntity.getDescription());
        bookEntity.setClassification(bookEntity.getClassification());
        bookEntity.setPrice((bookEntity.getPrice()));
        BookEntity updatedbook = bookService.updateBook(bookEntity);
        return new ResponseEntity<>(updatedbook, HttpStatus.OK);

    }

    @DeleteMapping("/deleteBook/{id}")
    public ResponseEntity<BookEntity> deleteBookById(@PathVariable("id") Long Id) {
        bookService.deleteBookById(Id);
        return new ResponseEntity<>(HttpStatus.OK);
    }


}
