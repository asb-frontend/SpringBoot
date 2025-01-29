package com.andrewbaker.learningspringboot.learning_spring_boot.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping
    public String greeting(@RequestParam(required = false, defaultValue = "") String name) {
        return name.isEmpty() ? "Hello!" : "Hello " + name;
    }
}
