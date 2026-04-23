package com.example.model;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name="Feedback")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Feedback {

    @Id
    private int fid;
    private String studentname;
    private String instructor;
    private String subject;
    @Enumerated(EnumType.STRING)
    private FbValue fbvalue;
}
