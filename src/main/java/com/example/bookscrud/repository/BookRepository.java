package com.example.bookscrud.repository;

import com.example.bookscrud.entity.BookEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import javax.persistence.Id;

@Repository
public interface BookRepository extends JpaRepository<BookEntity, Id> {
}
