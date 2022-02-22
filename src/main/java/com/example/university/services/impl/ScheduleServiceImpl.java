package com.example.university.services.impl;

import com.example.university.domain.Day;
import com.example.university.domain.Group;
import com.example.university.domain.Schedule;
import com.example.university.domain.Student;
import com.example.university.repo.*;
import com.example.university.services.ScheduleService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ScheduleServiceImpl implements ScheduleService {

    private final ScheduleRepository scheduleRepository;
    private final GroupRepository groupRepository;
    private final HallRepository hallRepository;
    private final LessonRepository lessonRepository;
    private final StudentRepository studentRepository;

    @Override
    public List<Schedule> findAll() {
        return scheduleRepository.findAll();
    }

    @Override
    public Schedule getOne(long id) {
        return scheduleRepository.getById(id);
    }

    @Override
    public Schedule save(Schedule schedule) {
        schedule.setGroup(groupRepository.getById(schedule.getGroup().getId()));
        schedule.setHall(hallRepository.getById(schedule.getHall().getId()));
        schedule.setLesson(lessonRepository.getById(schedule.getLesson().getId()));
        return scheduleRepository.save(schedule);
    }

    @Override
    public Schedule update(Schedule schedule) {
        Schedule scheduleFromDB = scheduleRepository.getById(schedule.getId());
        scheduleFromDB.setLesson(lessonRepository.getById(schedule.getLesson().getId()));
        scheduleFromDB.setHall(hallRepository.getById(schedule.getHall().getId()));
        scheduleFromDB.setGroup(groupRepository.getById(schedule.getGroup().getId()));
        return scheduleRepository.save(scheduleFromDB);
    }

    @Override
    public void delete(Schedule schedule) {
        scheduleRepository.delete(schedule);
    }

    @Override
    public List<Schedule> getByStudentAndDay(long studentId, Day day) {
        Student student = studentRepository.getById(studentId);
        Group group = student.getGroup();
        return scheduleRepository.findByGroupIdAndDays(group.getId(), day);
    }
}
