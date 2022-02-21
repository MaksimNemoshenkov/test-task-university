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
@ToString(of = {"id", "name"})
public class Hall {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @JsonView(Views.IdName.class)
    private Long id;

    @Setter
    @JsonView(Views.IdName.class)
    private String name;

    @Setter
    @OneToMany(mappedBy = "hall", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Schedule> schedules;

    public Hall(String name){
        this.name = name;
        schedules = new ArrayList<>();
    }
}