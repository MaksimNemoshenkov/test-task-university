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
    public Lesson save(String name) {
        return lessonRepository.save(new Lesson(name));
    }

    @Override
    public Lesson update(Lesson lessonFromDb, Lesson lesson) {
        lessonFromDb.setName(lesson.getName());
        return lessonRepository.save(lessonFromDb);
    }

    @Override
    public void delete(Lesson lesson) {
        lessonRepository.delete(lesson);
    }
}
