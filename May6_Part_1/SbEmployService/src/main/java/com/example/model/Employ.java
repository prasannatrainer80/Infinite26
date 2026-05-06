package com.example.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="Employ")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
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
