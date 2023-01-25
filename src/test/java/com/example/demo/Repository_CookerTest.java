package com.example.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Repository;
import org.springframework.test.annotation.Rollback;

import javax.transaction.Transactional;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
@Rollback
@Transactional
class Repository_CookerTest {

    @Autowired
    Service_Cooker cooker;

    @Autowired
    Repository_Cooker repositoryCooker;

    @Test
    @Rollback(value = false)

    void 테스트(){
        Cooker cooker=new Cooker();
        cooker.setExp(1);
        cooker.getId();
        cooker.setAge(23);
        repositoryCooker.save(cooker);

        //Assertions.assertEquals(cooker,repositoryCooker.save_one(23));

    }

}