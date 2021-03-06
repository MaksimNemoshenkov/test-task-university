package com.example.university.services;

import com.example.university.domain.Group;

import java.util.List;

public interface GroupService {
    List<Group> findAll();
    Group getOne (Long id);
    Group save (Group group);
    Group update(Group group);
    void delete(Group group);

}
