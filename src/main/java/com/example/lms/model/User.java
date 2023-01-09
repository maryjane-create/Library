package com.example.lms.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Component
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "Users")
public class User {

    private  String name;

    @Id
    private  String emailID;

    private  String password;

    private  enum  role{ADMIN, USER;}
}
