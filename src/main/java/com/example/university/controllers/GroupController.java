package com.example.university.controllers;

import com.example.university.domain.Group;
import com.example.university.domain.Views;
import com.example.university.services.GroupService;
import com.fasterxml.jackson.annotation.JsonView;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/group")
@AllArgsConstructor
public class GroupController {

    private final GroupService groupService;

    @GetMapping
    @JsonView(Views.IdName.class)
    public List<Group> getAll(){
        return groupService.findAll();
    }

    @GetMapping("{id}")
    @JsonView(Views.FullGroup.class)
    public Group getOne(@PathVariable long id){
        return groupService.getOne(id);
    }

    @PostMapping
    public Group create(@RequestBody Group group){
        return groupService.save(group);
    }

    @PutMapping
    @JsonView(Views.IdName.class)
    public Group update(@RequestBody Group group){
        return groupService.update(group);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable("id") Group group){
        groupService.delete(group);
    }

}
