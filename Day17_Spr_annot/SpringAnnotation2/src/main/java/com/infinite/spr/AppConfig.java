package com.infinite.spr;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Arrays;

@Configuration
@ComponentScan("com.infinite.spr")
public class AppConfig {

  @Bean
  public Student studentMega() {
    Student s1 = new Student();
    s1.setSno(1);
    s1.setFirstName("Mega");
    s1.setLastName("Albhones");
    return s1;
  }

  @Bean
  public Student studentNitish() {
    Student s1 = new Student();
    s1.setSno(2);
    s1.setFirstName("Nitish");
    s1.setLastName("Lakshmi");
    return s1;
  }

  @Bean
  public Student studentPavithra() {
    Student s1 = new Student();
    s1.setSno(1);
    s1.setFirstName("Pavithra");
    s1.setLastName("Palsmy");
    return s1;
  }

  // Equivalent to <bean id="trainer">
  @Bean
  public Trainer trainer() {

    Trainer trainer = new Trainer();
    trainer.setTrainerName("Prasanna...");
    trainer.setLocation("Hyderabad");

    trainer.setStudentList(
      Arrays.asList(
        studentMega(),
        studentNitish(),
        studentPavithra()
      )
    );

    return trainer;
  }

}
