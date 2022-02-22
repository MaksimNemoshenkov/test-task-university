package com.example.university.controllers;

import com.example.university.domain.Lesson;
import com.example.university.domain.Views;
import com.example.university.services.LessonService;
import com.fasterxml.jackson.annotation.JsonView;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/lesson")
@AllArgsConstructor
public class LessonController {

    private final LessonService lessonService;

    @GetMapping
    @JsonView(Views.IdName.class)
    public List<Lesson> getAll(){
        return lessonService.findAll();
    }

    @GetMapping("{id}")
    @JsonView(Views.IdName.class)
    public Lesson getOne(@PathVariable("id") Lesson lesson) {
        return lesson;
    }

    @PostMapping
    public Lesson create(@RequestBody Lesson lesson){
        return lessonService.save(lesson);
    }

    @PutMapping
    @JsonView(Views.IdName.class)
    public Lesson update(@RequestBody Lesson lesson){
        return lessonService.update(lesson);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable("id") Lesson lesson){
        lessonService.delete(lesson);
    }
}
