package com.example.university.repo;

import com.example.university.domain.Day;
import com.example.university.domain.Schedule;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ScheduleRepository extends JpaRepository<Schedule, Long> {

    List<Schedule> findByGroupId(long Id);

    List<Schedule> findByGroupIdAndDays(Long group_id, Day day);
}
