package com.example.demo;

import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@Repository
@NoArgsConstructor
public class SchoolRepository {
    @PersistenceContext
    EntityManager em;

    public void save(Student student){
        em.persist(student);
    }

    public Student students(Long id){
        return em.find(Student.class,id);
    }

    public List<Student> findAll_s(){
        return em.createQuery("select S from Student S", Student.class).getResultList();
    }

}
