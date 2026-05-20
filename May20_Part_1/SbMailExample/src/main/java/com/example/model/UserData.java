package com.example.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Table(name="UserData")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class UserData {

    @Id
    private int userId;
    private String firstName;
    private String lastName;
    private String userName;
    private String passWord;
    private String email;
    private String mobile;
    private String status;
    private String otp;
}
