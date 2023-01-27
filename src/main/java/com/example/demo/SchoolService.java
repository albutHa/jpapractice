package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SchoolService {

    @Autowired
     SchoolRepository repository;

    public Long save(Student student){
        repository.save(student);
        return student.getId();
    }


    public Student findOne(Long id) {
        return repository.students(id);
    }
}
