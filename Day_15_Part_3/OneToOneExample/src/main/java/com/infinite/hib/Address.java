package com.infinite.hib;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name="AddressInfinite")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Address {

  @Id
  @GeneratedValue(strategy= GenerationType.AUTO)
  private int addressId;

  private String address1;
  private String address2;
  private String city;
  private String state;
  private String zipcode;
  private String country;

  @JoinColumn(name="empId")
  @OneToOne(cascade=CascadeType.ALL)
  private Employee employee;
}
