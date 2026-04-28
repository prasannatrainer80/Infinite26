package com.example.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class Employ {

    private int empno;
    private String name;
    private String gender;
    private String dept;
    private String desig;
    private double basic;
}
