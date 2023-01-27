package com.example.demo;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name="orders")
@Getter @Setter
public class Member_Order {
    @Id
    @GeneratedValue
    @Column(name = "Member_order")
    private Long id;


    @ManyToOne
    @JoinColumn(name = "memberOrder_id")
    private Member_Order member_Orders_Info;



}
