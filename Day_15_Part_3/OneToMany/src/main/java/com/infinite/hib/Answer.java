package com.infinite.hib;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name="AnswerInfinite")
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Answer {
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  private int id;
  private String answerName;
  private String postedBy;

}
