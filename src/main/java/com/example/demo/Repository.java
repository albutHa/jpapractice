package com.example.demo;

import lombok.NoArgsConstructor;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@org.springframework.stereotype.Repository
@NoArgsConstructor
public class Repository {
    @PersistenceContext
    private EntityManager em;

    public void Save(Member_info memberInfo){
        em.persist(memberInfo);

    }

    public List<Member_info> findAll() {
        return em.createQuery("select m from Member_info m", Member_info.class)
                .getResultList();
    }

    public Member_info findOne(Long id) {
        return em.find(Member_info.class, id);
    }
}
