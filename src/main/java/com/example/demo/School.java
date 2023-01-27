package com.example.demo;

import lombok.Getter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity @Getter
public class School {
    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private String area;
    @OneToMany(mappedBy = "school")
    List<Student> students=new ArrayList<>();

}
