package com.example.university.services.impl;

import com.example.university.domain.Hall;
import com.example.university.repo.HallRepository;
import com.example.university.services.HallService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class HallServiceImpl implements HallService {

    private final HallRepository hallRepository;

    @Override
    public List<Hall> findAll(){
        List<Hall> halls = hallRepository.findAll();
/*        if (halls.isEmpty()) {
            throw new NoDataFoundException("halls");
        }*/
        return halls;
    }
    @Override
    public Hall getOne(Long id){
        existsById(id);
        Hall hall = hallRepository.getById(id);
        return hall;
    }

    public Long addHall(Hall hall) {
        existsById(hall.getId());
        save(hall);
        return hall.getId();
    }

    @Override
    public Hall save(Hall hall){
        return hallRepository.save(hall);
    }

    @Override
    public Hall save(String name) {
        return save(new Hall(name));
    }
    @Override
    public Hall update(Hall hall){
        Hall hallFromDB = hallRepository.getById(hall.getId());

        hallFromDB.setName(hall.getName());
        return hallRepository.save(hallFromDB);
    }
    @Override
    public Hall update(Long id, String name){
        Hall hall = getOne(id);
        hall.setName(name);
        return hallRepository.save(hall);
    }
    @Override
    public void delete(Hall hall){
        hallRepository.delete(hall);
    }
    @Override
    public void deleteById(Long id){
        existsById(id);
        hallRepository.deleteById(id);
    }
    @Override
    public Boolean existsById(Long id){
/*        if(!hallRepository.existsById(id)){
            throw new NotFoundException("hall", id);
        }*/
        return true;
    }
}
