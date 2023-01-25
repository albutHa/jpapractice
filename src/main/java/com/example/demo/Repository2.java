package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.Entity;
import javax.persistence.EntityManager;

@Repository
public class Repository2 {
    @Autowired
    EntityManager entityManager;


    public void insert(House house){

     entityManager.persist(house);
    }

}
