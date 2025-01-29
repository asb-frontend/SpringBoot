package com.andrewbaker.learningspringboot.learning_spring_boot.controller;

import com.andrewbaker.learningspringboot.learning_spring_boot.models.Chapter;
import com.andrewbaker.learningspringboot.learning_spring_boot.repository.ChapterRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;

@RestController
public class ChapterController {
    private final ChapterRepository chapterRepository;

    public ChapterController(ChapterRepository chapterRepository){
        this.chapterRepository = chapterRepository;
    }

    @GetMapping("/chapters")
    public Flux<Chapter> listing(){
        return chapterRepository.findAll();
    }

}
