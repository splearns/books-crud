package com.example.bookscrud.entity;

import javax.persistence.*;

@Entity
@Table(name = "books")
public class BookEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column
    private String name;
    @Column
    private String description;
    @Column
    private String author;
    @Column
    private double price;
    @Column
    private String isbn;
    @Column
    private String classification;



}
