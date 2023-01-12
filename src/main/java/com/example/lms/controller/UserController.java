package com.example.lms.controller;


import com.example.lms.model.User;
import com.example.lms.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
   private UserService userService;

    @GetMapping("/user/{emailID}")
    public  User getUserByEmail(@PathVariable String emailID){

    }

    public  User createUser() throws  Exception{

    }

}
