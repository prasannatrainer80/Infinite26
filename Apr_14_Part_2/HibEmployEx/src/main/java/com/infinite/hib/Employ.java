package com.infinite.hib;

import lombok.*;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name="Employ") // This must be db table name Assume table name is Employ_Infinite then given as
// @Table(name="Employ_Infinite") -- Then Employ class mapped to Employ_infinite table
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
