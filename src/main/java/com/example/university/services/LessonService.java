package com.example.university.services;

import com.example.university.domain.Lesson;

import java.util.List;

public interface LessonService {

    Lesson getOne(Long id);
    List<Lesson> findAll();
    Lesson save(Lesson lesson);
    Lesson update(Lesson lesson);
    void delete(Lesson lesson);
}
