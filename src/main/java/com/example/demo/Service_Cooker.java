package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Service_Cooker {
    @Autowired
    Repository_Cooker repository_Cooker;

    public Long save(Cooker cooker) {

            validateDuplicateCooker(cooker);
        repository_Cooker.save(cooker);
       return cooker.getId();
    }

    public List<Cooker> findmember(){
        return repository_Cooker.find_all();
    }

    private void validateDuplicateCooker(Cooker cooker)  {
     List<Cooker> findcooker= repository_Cooker.findbyName(cooker.getName());
        if(!findcooker.isEmpty()){

            throw new IllegalStateException("이미 존재하는 회원입니다.");
        }
    }
}
