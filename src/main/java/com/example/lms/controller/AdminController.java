package com.example.lms.controller;


import com.example.lms.model.Book;
import com.example.lms.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AdminController {
    @Autowired
    AdminService admin;
    @PostMapping("/add")
    public String addBook(@RequestBody Book book){
        admin.saveOrUpdate(book);
        return book.getIsbn();
    }

    @PutMapping("/update")
    public Book updateBook(@RequestBody Book book){
        admin.saveOrUpdate(book);
        return  book;
    }

    @RequestMapping("/all")
    public List<Book>getAllBooks(){
        List<Book> books=admin.getAllBooks();
        return  books;
    }

    @GetMapping("/book/{isbn}")
    public Book getBookByIsbn(String isbn){
        Book requestedBook=admin.getBookById(isbn);
        return  requestedBook;

    }

    @DeleteMapping("/book/{isbn}")
    public  void  deleteBookByIsbn(@PathVariable("isbn") String isbn){
        admin.deleteById(isbn);
    }
}
