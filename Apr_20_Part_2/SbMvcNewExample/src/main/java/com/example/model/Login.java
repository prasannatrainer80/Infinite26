package com.example.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
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
public class Login {
    @Id
    private String userName;
    private String passCode;
}
