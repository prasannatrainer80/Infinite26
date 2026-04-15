package com.infinite.hib;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name="QuestionInfinite")
public class Question {

  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int id;
  private String qname;
  @OneToMany(cascade = CascadeType.ALL)
  @JoinColumn(name="qid")
  private List<Answer> answers;


}
