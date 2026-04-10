package com.infinite.spr;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.infinite.spr")
public class AppConfig {

  @Bean
  public Person personDinesh() {
    Person p1 = new Person();
    p1.setId(1);
    p1.setName("Dinesh");
    JobDetails jd = new JobDetails();
    jd.setCompany("Infinite");
    jd.setJob("Software Engineer");
    jd.setLocation("Bangalore");
    p1.setJobDetails(jd);
    Family f = new Family();
    f.setCity("Cudalore");
    f.setState("TN");
    p1.setFamily(f);
    return p1;
  }

  @Bean
  public Person personAkshaya() {
    Person p1 = new Person();
    p1.setId(2);
    p1.setName("Akshaya");
    JobDetails jd = new JobDetails();
    jd.setCompany("Infinite");
    jd.setJob("Software Engineer");
    jd.setLocation("Bangalore");
    p1.setJobDetails(jd);
    Family f = new Family();
    f.setCity("Erode");
    f.setState("TN");
    p1.setFamily(f);
    return p1;
  }
}
