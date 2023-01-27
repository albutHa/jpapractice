package com.example.demo;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.transaction.annotation.Transactional;

@SpringBootTest
@Transactional

class Repository_CookerTest {

    @Autowired
    Service_Cooker Service_Cooker;

    @Autowired
    Repository_Cooker repositoryCooker;

    @Test
    @Rollback(value = false)
    void 테스트(){
        Cooker cooker=new Cooker();
       //cooker.setId(123L);
      // cooker.getId();
        cooker.setExp(1);
        cooker.setName("123");
        cooker.setAge(23);
        Long id=Service_Cooker.save(cooker);

        Assertions.assertEquals(cooker,repositoryCooker.find_one(id));

    }

}