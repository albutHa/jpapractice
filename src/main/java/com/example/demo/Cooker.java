package com.example.demo;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter @Setter

public class Cooker {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cooker_id")
    private Long Id;

    private String name;
    private int age;
    private int exp;

    @OneToMany(mappedBy = "cooker")
    List<Food> list=new ArrayList<>();



}
