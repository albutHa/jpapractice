package com.example.demo;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Entity @Getter @Setter
public class Food {
    @Id @GeneratedValue
    private Long Id;

    private int foodCord;

    private int quentity;

    public void addFood(int quentity) {
        this.quentity += quentity;
    }

    public void minFood(int quentity) throws StockException {
       int foodstock=this.quentity-quentity;
       if(foodstock<0){
           throw  new StockException("주문마감");
       }
       this.quentity=foodstock;
    }




    @ManyToOne
    private Cooker cooker;


}
