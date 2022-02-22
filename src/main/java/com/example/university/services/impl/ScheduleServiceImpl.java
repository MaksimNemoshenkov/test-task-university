package com.example.university.services.impl;

import com.example.university.domain.Schedule;
import com.example.university.repo.GroupRepository;
import com.example.university.repo.HallRepository;
import com.example.university.repo.LessonRepository;
import com.example.university.repo.ScheduleRepository;
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
}
