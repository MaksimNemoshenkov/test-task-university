package com.example.university.services;

import com.example.university.domain.Group;
import com.example.university.domain.Student;

import java.util.List;

public interface StudentService{
    List<Student> findAll();
    Student create(Student student, Group group);
    Student createByName(String studentName, String groupName);

    void delete();

}
