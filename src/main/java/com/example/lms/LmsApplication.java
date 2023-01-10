package com.example.lms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories

public class LmsApplication {
    public static void main(String[] args) {
        SpringApplication.run(LmsApplication.class, args);

    }
}
