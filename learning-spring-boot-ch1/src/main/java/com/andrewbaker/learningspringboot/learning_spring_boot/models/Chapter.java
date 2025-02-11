package com.andrewbaker.learningspringboot.learning_spring_boot.models;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document
public class Chapter {
    @Id
    private String id;
    private String name;

    public Chapter(String name) {
        this.name = name;
    }
}
