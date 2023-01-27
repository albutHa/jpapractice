package com.example.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
@Transactional
class ServiceTest {

    @Autowired
    SchoolRepository repository;

    @Autowired
    SchoolService service;

    @Test
    @Rollback(false)
    public  void 회원입력(){
        Student student=new Student();
        student.setAge(12);
        student.setSex("남");

        Long id= service.save(student);

        Assertions.assertEquals(student,repository.students(id));

    }
}

