package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Service_Cooker {
    @Autowired
    Repository_Cooker repository_Cooker;

    public Long save(Cooker cooker){
       repository_Cooker.save(cooker);
       return cooker.getId();
    }
}
