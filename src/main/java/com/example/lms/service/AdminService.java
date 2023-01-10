package com.example.lms.service;


import com.example.lms.model.Book;
import com.example.lms.repo.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AdminService {
    @Autowired
    private  BookRepo bookRepo;


    public void saveOrUpdate(Book book) {
        bookRepo.save(book);
    }

    public List<Book>getAllBooks(){
        List<Book> books=new ArrayList<>();
        bookRepo.findAll().forEach(book -> books.add(book));
        return  books;
    }

    public  Book getBookById(String isbn){
        return  bookRepo.findById(isbn).get();
    }

    public  void  deleteById(String isbn){
        bookRepo.deleteById(isbn);
    }
    public  Book updateBook(Book book, String isbn){
        Book updatedBook=bookRepo.save(book);
        return  updatedBook;
    }


}
