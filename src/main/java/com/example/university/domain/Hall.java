package com.example.university.domain;

import com.fasterxml.jackson.annotation.JsonView;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@NoArgsConstructor
@Table(name = "hall")
public class Hall {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @JsonView(Views.IdName.class)
    private Long id;

    @Setter
    @JsonView(Views.IdName.class)
    private String name;

    @Setter
    @JsonView(Views.FullHall.class)
    @OneToMany(mappedBy = "hall", cascade = CascadeType.ALL)
    @ToString.Exclude
    private List<Schedule> schedules;

    public Hall(String name){
        this.name = name;
        schedules = new ArrayList<>();
    }
}