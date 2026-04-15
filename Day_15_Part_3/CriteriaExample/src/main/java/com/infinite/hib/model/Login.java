package com.infinite.hib.model;

import lombok.*;

import javax.persistence.*;

@NamedQueries({
  @NamedQuery(
    name="login",
    query = "from Login where userName=:userName and passCode=:passCode"
  ),
})

@Entity
@Table(name="Login")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Login {

  @Id
  @Column(name="userName")
  private String userName;
  @Column(name="passCode")
  private String passCode;
}
