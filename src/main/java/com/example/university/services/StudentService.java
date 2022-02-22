package com.example.university.services;

import com.example.university.domain.Student;

import java.util.List;

public interface StudentService{
    List<Student> findAll();
    Student getOne (long id);
    Student save(Student student);
    Student update(Student student);
    void delete(Student student);



}
