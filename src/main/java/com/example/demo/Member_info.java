package com.example.demo;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity @Getter @Setter
public class Member_info {
    @GeneratedValue
    @javax.persistence.Id
    private Long Id;
    private String name;


    @OneToMany(mappedBy = "member_Orders_Info")
    private List<Member_Order> orders =new ArrayList<>();
    @OneToMany(mappedBy = "memberInfo")
    private List<Book> book=new ArrayList<>();
}
