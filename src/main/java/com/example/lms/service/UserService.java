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
    public UserRepo repo;


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


    public Optional<User> getUserById(String emailID) {
        Optional<User>returned=null;
        Optional<User> requestedUser=repo.findById(emailID);
        List<User>users=new ArrayList<>();
        for (User anyUser: users){
            if (anyUser.getEmailID().equals(requestedUser.get())){
                 returned=requestedUser;
            }
            else  returned=null;
            }
        return returned;

    }

}


