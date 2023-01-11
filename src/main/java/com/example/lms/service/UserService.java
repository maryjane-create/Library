package com.example.lms.service;


import com.example.lms.model.Book;
import com.example.lms.model.User;
import com.example.lms.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {
    @Autowired
    UserRepo repo;


    public  User register(User user){
        user.setName(user.getName());
        user.setEmailID(user.getEmailID());
        user.setPassword(user.getPassword());
        repo.save(user);
        return  user;
    }
    public User borrowBook(User user, Book requestedBook) throws  Exception{
        if (register(user).equals(user)){
            List<Book>books=new ArrayList<>();
            for (Book book:books){
                if (book.getIsbn().equals(requestedBook.getIsbn())){
                    return  user;
                }
                return user;
            }
        }

        return  null;
        }



    }


