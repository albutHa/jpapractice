package com.example.demo;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity @Getter @Setter
public class Student {
    @Id
    @GeneratedValue
    private Long Id;
    private String sex;
    private int age;
    private int grade;
    @ManyToOne
    private School school;


}
