package com.example.model;

import lombok.*;
import org.springframework.web.bind.annotation.GetMapping;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Employ {

    private int empno;
    private String name;
    private double basic;
}
