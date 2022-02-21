package com.example.university.controllers;

import com.example.university.domain.Hall;
import com.example.university.domain.Views;
import com.example.university.services.HallService;
import com.fasterxml.jackson.annotation.JsonView;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/hall")
@AllArgsConstructor
public class HallController {

    private final HallService hallService;

    @GetMapping
    @JsonView(Views.IdName.class)
    public List<Hall> list(){
        return hallService.findAll();
    }

    @GetMapping("{id}")
    @JsonView(Views.IdName.class)
    public Hall getOne(@PathVariable("id") Hall hall) {
        return hall;
    }

    @PostMapping
    public Hall create(@RequestBody Hall hall){
        return hallService.save(hall);
    }

    @PutMapping("{id}")
    public Hall update(@PathVariable("id") Hall hallFromDB, @RequestBody Hall hall){
        return hallService.update(hallFromDB, hall);
    }

    @DeleteMapping("{id}")
    public void delete(@PathVariable("id") Hall hall){
        hallService.delete(hall);
    }
}
