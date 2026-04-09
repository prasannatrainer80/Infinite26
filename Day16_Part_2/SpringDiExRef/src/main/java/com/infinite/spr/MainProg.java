package com.infinite.spr;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainProg {
  public static void main(String[] args) {
    ApplicationContext ctx = new
      ClassPathXmlApplicationContext("person.xml");
    Person person1 = (Person)ctx.getBean("personDhivya");
    person1.showAllInfo();
    System.out.println("======================================");
    Person person2 = (Person)ctx.getBean("personBalu");
    person2.showAllInfo();
    System.out.println("======================================");
    Person person3 = (Person)ctx.getBean("personMega");
    person3.showAllInfo();
  }
}
