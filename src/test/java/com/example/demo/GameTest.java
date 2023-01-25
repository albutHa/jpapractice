package com.example.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;

import javax.persistence.EntityManager;
import javax.swing.text.html.parser.Entity;
import javax.transaction.Transactional;

@SpringBootTest
@Transactional
@DisplayName("game Test")
public class GameTest {

    @Autowired
    Repository repository;

    @Autowired
    Service service;

    @Test
    @Rollback(false)
    public void Test(){
        Member_info memberInfo1 =new Member_info();
        memberInfo1.setName("tester1");
        Long id= service.save(memberInfo1);

        Assertions.assertEquals(memberInfo1,repository.findOne(id));




    }


}
