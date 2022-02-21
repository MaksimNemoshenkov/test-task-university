package com.example.university.services.impl;

import com.example.university.domain.Group;
import com.example.university.domain.Student;
import com.example.university.repo.GroupRepository;
import com.example.university.repo.StudentRepository;
import com.example.university.services.StudentService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;
    private final GroupRepository groupRepository;

    @Override
    public List<Student> findAll() {
        return studentRepository.findAll();
    }

    @Override
    public Student create(Student student, Group group) {
        student.setGroup(group);
        studentRepository.save(student);
        return student;
    }

    @Override
    public Student createByName(String studentName, String groupName) {

        return null;
    }

    @Override
    public void delete() {

    }

}
