package com.example.lms.repository;

import com.example.lms.model.Book;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

@Component
@Repository
public interface BookRepo extends MongoRepository<String, Book> {
}
