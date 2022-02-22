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
    public List<Student> getAll (){
        return studentService.findAll();
    }

    @GetMapping("{id}")
    @JsonView(Views.FullStudent.class)
    public Student getOne(@PathVariable long id){
        return studentService.getOne(id);
    }

    @PostMapping
    @JsonView(Views.FullStudent.class)
    public Student create(@RequestBody Student student){
        return studentService.save(student);
    }

    @PutMapping
    @JsonView(Views.FullStudent.class)
    public Student update(@RequestBody Student student){
        return studentService.update(student);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable("id") Student student){
        studentService.delete(student);
    }

}