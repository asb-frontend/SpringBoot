package com.andrewbaker.learningspringboot.learning_spring_boot.repository;

import com.andrewbaker.learningspringboot.learning_spring_boot.models.Chapter;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;

public interface ChapterRepository extends ReactiveCrudRepository<Chapter, String> {

}
