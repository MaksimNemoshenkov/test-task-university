package com.example.university.services.impl;

import com.example.university.domain.Lesson;
import com.example.university.repo.LessonRepository;
import com.example.university.services.LessonService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class LessonServiceImpl implements LessonService {

    private final LessonRepository lessonRepository;

    @Override
    public Lesson getOne(Long id) {
        return lessonRepository.getById(id);
    }

    @Override
    public List<Lesson> findAll() {
        return lessonRepository.findAll();
    }

    @Override
    public Lesson save(Lesson lesson) {
        return lessonRepository.save(lesson);
    }

    @Override
    public Lesson update(Lesson lesson) {
        Lesson lessonFromDb = lessonRepository.getById(lesson.getId());
        lessonFromDb.setName(lesson.getName());
        return lessonRepository.save(lessonFromDb);
    }

    @Override
    public void delete(Lesson lesson) {
        lessonRepository.delete(lesson);
    }
}
