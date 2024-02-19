package com.example.bookscrud.entity;

import com.sun.istack.NotNull;
import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Entity
@Data
@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
@Table(name = "books")
public class BookEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    @NotNull
    @Size(min = 5)
    private String name;
    @Column
    @Size(max = 250)
    private String description;
    @Column
    private String author;
    @Column
    @NotNull
    private double price;
    @Column
    @NotNull
    @Pattern(regexp = "^[A-Za-z]{3}-\\d{4}$")
    private String isbn;
    @Column
    private String classification;



}
