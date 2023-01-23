package com.example.demo;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Guest {

    @Id
    @GeneratedValue
    private Long id;

    private Date date;

    @OneToOne
    private House House;

}
