package com.example.demo;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "game")
public class Game {
    @Id
    @GeneratedValue
    private Long gamecode;
    private Date logintime;

    @OneToMany (mappedBy = "game")
    List<Charactor> charactors=new ArrayList();


}
