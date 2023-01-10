package com.example.lms.controller;


import com.example.lms.model.Book;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {


    @GetMapping("/book/{isbn}")
    public Book borrowBook(){

    }
}
