package com.infinite.hib.model;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name="Employ")
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
