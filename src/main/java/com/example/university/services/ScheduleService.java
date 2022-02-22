package com.example.university.services;

import com.example.university.domain.Day;
import com.example.university.domain.Schedule;

import java.util.List;

public interface ScheduleService {
    List<Schedule> findAll();
    Schedule getOne (long id);
    Schedule save (Schedule schedule);
    Schedule update(Schedule schedule);
    void delete(Schedule schedule);

    List<Schedule> getByStudentAndDay(long student, Day day);
}
