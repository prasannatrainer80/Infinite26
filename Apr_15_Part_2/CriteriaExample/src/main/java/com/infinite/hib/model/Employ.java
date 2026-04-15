package com.infinite.hib.model;

import lombok.*;

import javax.persistence.*;

@NamedQueries({
  @NamedQuery(
    name="showEmploy",
    query = "from Employ"
  ),
  @NamedQuery(
    name="searchEmploy",
    query = "from Employ where empno=:empno"
  )
})

@Entity
@Table(name="Employ")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
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
