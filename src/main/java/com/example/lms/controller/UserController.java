package com.example.lms.controller;


import com.example.lms.model.Book;
import com.example.lms.model.User;
import com.example.lms.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    UserService user;
//    @GetMapping("/book/{isbn}")
//    public User borrowBook(Book book){
////        Book requestedBook=book.
//
//    }
}
