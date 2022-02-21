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

    @GetMapping("all")
    @JsonView(Views.IdName.class)
    public List<Group> list(){
        return groupService.findAll();
    }

    @GetMapping
    public Group getOne(@RequestParam Long id ){
        return groupService.getOne(id);
    }
}
