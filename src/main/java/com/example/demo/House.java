package com.example.demo;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
public class House {
    @Id
    @GeneratedValue
    private Long id;

    @OneToOne
    private Guest guest;

    @Embedded
    private Place place;

}
