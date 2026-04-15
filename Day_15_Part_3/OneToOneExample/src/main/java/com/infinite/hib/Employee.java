package com.infinite.hib;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name="EmployeeInfinite")
public class Employee {
  @Id
  @PrimaryKeyJoinColumn
  @GeneratedValue(strategy=GenerationType.AUTO)
  private int empId;
  private String name;
  private String email;

}
