package com.example.demo;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity @Getter @Setter
public class Food {
    @Id @GeneratedValue
    private Long Id;

    private int foodCord;

    @ManyToOne
    private Cooker cooker;


}
