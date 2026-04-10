package com.infinite.spr;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.infinite.spr")
public class AppConfig {

  @Bean
  public JobDetails jobBangalore() {
    return new JobDetails("Software Engineer","Infinite","Bangalore");
  }

  @Bean
  public JobDetails jobHyderabad() {
    return new JobDetails("Software Engineer","Infinite","Hyderabad");
  }

  @Bean
  public Person personDeva() {
    return new Person(
      1,
      "Deva",
      jobBangalore(),   // SAME bean reused
      new Family("Chennai", "TN")
    );
  }

  @Bean
  public Person personMega() {
    return new Person(
      2,
      "Mega",
      jobHyderabad(),   // SAME bean reused
      new Family("Selam", "TN")
    );
  }

  @Bean
  public Person personAkshaya() {
    return new Person(
      3,
      "Akayaya",
      jobBangalore(),   // SAME bean reused
      new Family("Swamimalai", "TN")
    );
  }

  @Bean
  public Person personKaviya() {
    return new Person(
      4,
      "Kaviya",
      jobHyderabad(),   // SAME bean reused
      new Family("Erode", "TN")
    );
  }


}
