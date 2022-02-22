package com.example.university.services.impl;

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
    public Student getOne(long id) {
        return studentRepository.getById(id);
    }

    @Override
    public Student save(Student student) {
        student.setGroup(groupRepository.getById(student.getGroup().getId()));
        return studentRepository.save(student);
    }

    @Override
    public Student update(Student student) {
        Student studentFromDb = studentRepository.getById(student.getId());
        studentFromDb.setName(student.getName());
        return studentRepository.save(studentFromDb);
    }

    @Override
    public void delete(Student student) {
        studentRepository.delete(student);
    }

}
