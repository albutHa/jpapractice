package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;

@org.springframework.stereotype.Service
public class Service {
    @Autowired
    private  Repository repository;


    public Long save(Member_info memberInfo){
        repository.Save(memberInfo);
        return memberInfo.getId();
    }


}
