package com.example.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

@Entity
@Table(name="Subjects")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Subjects {

    @Id
    private int subjectid;
    private int year;
    private String instructor;
    private String subject;
    private int theory;
    private int practical;
}
