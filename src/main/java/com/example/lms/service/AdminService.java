package com.example.lms.service;

import com.example.lms.model.Book;
import com.example.lms.model.User;

public interface AdminService {
     Book addBook();

     User addUser();

     User lendBook(User user, Book book);

     void  blockUser(String userId);

     void  deleteBook(String bookId);




}
