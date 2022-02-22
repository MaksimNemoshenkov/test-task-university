package com.example.university.domain;


import com.fasterxml.jackson.annotation.JsonView;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Entity
@NoArgsConstructor
@Getter
@Table(name = "schedule")
public class Schedule {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @JsonView(Views.IdName.class)
    private Long id;

    @Setter
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "lesson_id")
    @JsonView(Views.IdName.class)
    private Lesson lesson;

    @Setter
    @ManyToOne(fetch = FetchType.EAGER)

    @JoinColumn(name = "hall_id")
    @JsonView(Views.IdName.class)
    private Hall hall;

    @Setter
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "group_id")
    @JsonView(Views.IdName.class)
    private Group group;

    @ElementCollection(targetClass = Day.class, fetch = FetchType.EAGER)
    @CollectionTable(name = "day", joinColumns = @JoinColumn(name = "day_id"))
    @Enumerated(EnumType.STRING)
    @JsonView(Views.IdName.class)
    private Set<Day> days;

}
