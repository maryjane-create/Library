package com.example.lms;

import com.example.lms.model.User;
import com.example.lms.repo.UserRepo;
import com.example.lms.service.UserService;
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
        System.out.println(randomUser);



    }
}
