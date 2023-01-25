package com.example.demo;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

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
    @OneToMany(mappedBy = "House")
    List<Familly> f=new ArrayList<>();

}
