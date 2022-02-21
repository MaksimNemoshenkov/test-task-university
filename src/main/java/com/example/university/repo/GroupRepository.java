package com.example.university.repo;

import com.example.university.domain.Group;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GroupRepository extends JpaRepository<Group, Long> {

    @EntityGraph(attributePaths = { "students" })
    List<Group> findAll();

}
