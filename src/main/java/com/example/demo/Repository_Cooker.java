package com.example.demo;

import lombok.NoArgsConstructor;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
@NoArgsConstructor
public class Repository_Cooker {

    @PersistenceContext
     EntityManager em;

    public void save(Cooker cooker){

        em.persist(cooker);

    }

    public Cooker find_one(Long id){
        return em.find(Cooker.class,id);
    }


    public List<Cooker> find_all() {
       return em.createQuery("select c from Cooker c",Cooker.class).getResultList();
    }

    public List<Cooker> findbyName(String name){
        return em.createQuery("select c from Cooker c where c.name= :name", Cooker.class).setParameter("name", name).getResultList();
    }

}
