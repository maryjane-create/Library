package com.example.lms;

import com.example.lms.model.Book;
import com.example.lms.model.User;
import com.example.lms.repo.UserRepo;
import com.example.lms.service.UserService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.bson.assertions.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTest {




    @Test
    void testThatUserCanBorrowBook() throws Exception {


    }

    @Test
    void testThatUserIsRegistered(@Autowired User user){
        user.setName("juu");
        assertNotNull(user);
        assertEquals("user", user.getName());
    }

    @Test
    void  testThatUserCanReviewBook(){

    }

    @Test
    void  testThatUserCanRemoveBook(){

    }


}
