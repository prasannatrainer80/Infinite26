package com.example.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.sql.Date;

@Entity
@Table(name="courselist")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CourseList {

    @Id
    private String courseno;
    private int duration;
    private Date startdate;
    private Date enddate;
    private String hod;
}
