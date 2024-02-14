package com.example.bookscrud.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

    @RequestMapping("/sp")
    public String hello()

    {
        return "Hey";
    }

}
