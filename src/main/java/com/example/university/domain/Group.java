package com.example.university.domain;

import com.fasterxml.jackson.annotation.JsonView;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Getter
@NoArgsConstructor
@Table(name = "group_of_students")
public class Group {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @JsonView(Views.IdName.class)
    private Long id;

    @Setter
    @JsonView(Views.IdName.class)
    private String name;

    @Setter
    @OneToMany (mappedBy="group", fetch=FetchType.EAGER)
    @JsonView(Views.FullGroup.class)
    private List<Student> students;

    public Group(String name){
        this.name = name;
    }
}
