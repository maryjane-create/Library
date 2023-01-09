package com.example.lms.service;

import com.example.lms.model.Admin;
import com.example.lms.model.Book;
import com.example.lms.model.User;
import com.example.lms.repository.AdminRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class AdminServiceImpl implements  AdminService{

@Autowired
AdminRepo adminRepo;
@Autowired
Book book;

    @Override
    public Book addBook() {

        book.setTitle(book.getTitle());
        book.setAuthor(book.getAuthor());
        book.setIsbn(book.getIsbn());
        book.setStatus(book.getStatus());
        book.setEdition(book.getEdition());
        book.setStatus(book.getStatus());
        book.setReview(0);
        adminRepo.save(book);

        return null;
    }

    @Override
    public User addUser() {
        return null;
    }

    @Override
    public User lendBook(User user, Book book) {
        return null;
    }

    @Override
    public void blockUser(String userId) {

    }

    @Override
    public void deleteBook(String bookId) {

    }
}
