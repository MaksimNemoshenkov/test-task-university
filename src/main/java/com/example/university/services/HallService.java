package com.example.university.services;

import com.example.university.domain.Hall;

import java.util.List;

public interface HallService{
    Hall getOne(Long id);
    Hall save(Hall hall);
    Hall save(String name);
    List<Hall> findAll();
    Hall update(Hall hall);
    Hall update(Long id, String name);
    void deleteById(Long id);
    void delete(Hall hall);
    Boolean existsById(Long id);
}
