package com.example.demo;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
public class Charactor {
    @Id
    @GeneratedValue
    private Long name;

    private String job;
    private String level;
    @ManyToOne
    Game game;
}
