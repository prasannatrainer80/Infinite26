package com.example.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name="Employ")
@Getter
@Setter
@ToString
public class Employ {

    @Id
    private int empno;
    private String name;
    @Enumerated(EnumType.STRING)
    private Gender gender;
    private String dept;
    private String desig;
    private double basic;
}
