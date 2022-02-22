package com.example.university.controllers;

import com.example.university.domain.Day;
import com.example.university.domain.Schedule;
import com.example.university.domain.Views;
import com.example.university.services.ScheduleService;
import com.fasterxml.jackson.annotation.JsonView;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/schedule")
@AllArgsConstructor
public class ScheduleController {

    private final ScheduleService scheduleService;

    @GetMapping
    @JsonView(Views.IdName.class)
    public List<Schedule> getAll (){
        return scheduleService.findAll();
    }

    @GetMapping("{id}")
    @JsonView(Views.FullStudent.class)
    public Schedule getOne(@PathVariable long id){
        return scheduleService.getOne(id);
    }

    @GetMapping("/student")
    @JsonView(Views.FullStudent.class)
    public  List<Schedule> getForStudentAndDay (@RequestParam long student, Day day) {
        return scheduleService.getByStudentAndDay(student, day);
    }

    @PostMapping
    @JsonView(Views.FullStudent.class)
    public Schedule create(@RequestBody Schedule schedule){
        return scheduleService.save(schedule);
    }

    @PutMapping
    @JsonView(Views.FullStudent.class)
    public Schedule update(@RequestBody Schedule schedule){
        return scheduleService.update(schedule);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable("id") Schedule schedule){
        scheduleService.delete(schedule);
    }
}
