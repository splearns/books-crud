package com.example.bookscrud.service;

import com.example.bookscrud.entity.BookEntity;
import com.example.bookscrud.exception.BookNotFoundException;
import com.example.bookscrud.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookServiceImpl implements BookService{

    @Autowired
    private BookRepository bookRepository;

    @Override
    public List<BookEntity> getAllBooks() {
        return bookRepository.findAll();
    }

    @Override
    public BookEntity findBookById(Long Id) {
        Optional<BookEntity> bookinfo = bookRepository.findById(Id);
        return bookinfo.orElseThrow(
                ()
                        -> new BookNotFoundException("Book Not found"));
    }

    @Override
    public BookEntity addNewBook(BookEntity bookEntity) {
        return bookRepository.save(bookEntity);
    }

    @Override
    public BookEntity updateBook(BookEntity bookEntity) {

        BookEntity currentbook = bookRepository.findById(bookEntity.getId()).get();
        currentbook.setPrice(bookEntity.getPrice());
        currentbook.setClassification(bookEntity.getClassification());
        currentbook.setDescription(bookEntity.getDescription());
        BookEntity updatedbook = bookRepository.save(currentbook);
        return updatedbook;
    }

    @Override
    public void deleteBookById(Long Id) {

         bookRepository.deleteById(Id);

    }
}
