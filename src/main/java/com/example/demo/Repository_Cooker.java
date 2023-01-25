package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class Repository_Cooker {

    @Autowired
    private EntityManager entityManager;

    public void save(Cooker cooker){
        entityManager.persist(cooker);
    }

    public Cooker save_one(int age){
        return entityManager.find(Cooker.class,age);
    }



}
