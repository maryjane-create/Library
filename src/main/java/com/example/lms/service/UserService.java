package com.example.lms.service;

import com.example.lms.model.Book;
import com.example.lms.model.User;

public interface UserService {
    Book borrowBook();

    Book giveReview(Book book);

    User register();

    void  deleteBook(Book book);


}
