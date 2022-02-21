package com.example.university.controllers;

import com.example.university.domain.Student;
import com.example.university.domain.Views;
import com.example.university.services.StudentService;
import com.fasterxml.jackson.annotation.JsonView;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/student")
@AllArgsConstructor
public class StudentController {

    private final StudentService studentService;

    @GetMapping
    @JsonView(Views.IdName.class)
    public List<Student> list (){
        return studentService.findAll();
    }

    @PostMapping
    public Student create(@RequestParam String studentName,
                                        String groupName
    ){
        studentService.createByName(studentName, groupName);
        return new Student();
    }
}
