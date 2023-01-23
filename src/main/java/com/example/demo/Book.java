package com.example.demo;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
public class Book {

    @GeneratedValue
    @Id
    private Long bookcode;

    private String bookname;
    private Date date;

    @ManyToOne
    @JoinColumn(name = "bookCode")
    private Member_info memberInfo;



}
