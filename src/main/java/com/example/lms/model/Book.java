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
@Document(collection = "Books")
public class Book {

    private  String title;

    private String author;

    @Id
    private  String isbn;

    private  String edition;

    private  Boolean status;

    private  int review;
}
