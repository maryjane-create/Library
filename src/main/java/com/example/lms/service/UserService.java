package com.example.lms.service;


import com.example.lms.exception.UserNotFoundException;
import com.example.lms.model.Book;
import com.example.lms.model.User;
import com.example.lms.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserService {
    @Autowired
    UserRepo  repo;




    public  void register(User user){
        repo.save(user);
    }


    public User borrowBook(User user, Book requestedBook) throws  Exception{
        return  null;
    }

    public User giveReview(Book readBook, User user) throws UserNotFoundException{
        Optional<User> requestedUser=repo.findById(user.getEmailID());
        List<User>users=new ArrayList<>();
        for (User anyUser: users){
        if (anyUser.getEmailID().equals(requestedUser.get())){
            readBook.setReview(readBook.getReview());
        }
        else throw new UserNotFoundException();
        }
        return  user;
    }



    }


