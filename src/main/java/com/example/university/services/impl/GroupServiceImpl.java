package com.example.university.services.impl;

import com.example.university.domain.Group;
import com.example.university.repo.GroupRepository;
import com.example.university.services.GroupService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class GroupServiceImpl implements GroupService {

    private final GroupRepository groupRepository;

    @Override
    public List<Group> findAll() {
        return groupRepository.findAll();
    }

    @Override
    public Group getOne(Long id) {
        return groupRepository.getById(id);
    }

    @Override
    public Group save(Group group) {
        return groupRepository.save(group);
    }

    @Override
    public Group update(Group group) {
        Group groupFromDb = groupRepository.getById(group.getId());
        groupFromDb.setName(group.getName());
        return groupRepository.save(groupFromDb);
    }

    @Override
    public void delete(Group group) {
        groupRepository.delete(group);
    }

}
