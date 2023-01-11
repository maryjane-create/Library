package com.example.lms;

import com.example.lms.controller.UserController;
import com.example.lms.model.Book;
import com.example.lms.model.User;
import com.example.lms.service.UserService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class UserTest {
    @Test
    void testThatUserCanBorrowBook() throws Exception {
        UserService user=new UserService();
        User randomUser=new User();
        randomUser.setName("jackson");
        randomUser.setEmailID("u@gmail.com");
        randomUser.setPassword("pass");
        user.register(randomUser);
        Book book= new Book();
        User anyUser= new User();
        User returnedUser= user.borrowBook(anyUser, book);
        Assertions.assertEquals(returnedUser, randomUser);

    }
}
