package com.example.university.domain;

import com.fasterxml.jackson.annotation.JsonView;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@Getter
@Table(name = "student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @JsonView(Views.IdName.class)
    private Long id;

    @Setter
    @JsonView(Views.IdName.class)
    private String name;

    @Setter
    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.PERSIST, optional = false)
    @JsonView(Views.FullStudent.class)
    @JoinColumn(name = "group_id", nullable = false)
    private Group group;

    public Student(String name){
        this.name = name;
    }

}
