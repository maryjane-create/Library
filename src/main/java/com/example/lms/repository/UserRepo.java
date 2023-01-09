package com.example.lms.repository;

import com.example.lms.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;


@Component
@Repository
public interface UserRepo extends MongoRepository<String, User> {
}
