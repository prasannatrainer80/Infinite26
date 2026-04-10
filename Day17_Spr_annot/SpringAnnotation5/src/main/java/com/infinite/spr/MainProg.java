package com.infinite.spr;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainProg {
  public static void main(String[] args) {
    AnnotationConfigApplicationContext ctx =
      new AnnotationConfigApplicationContext(AppConfig.class);

    Person p1 = ctx.getBean("personMega", Person.class);
    Person p2 = ctx.getBean("personAkshaya", Person.class);
    Person p3 = ctx.getBean("personDeva", Person.class);
    Person p4 = ctx.getBean("personKaviya", Person.class);

    p1.showInfo();
    System.out.println("===================================");
    p2.showInfo();
    System.out.println("===================================");
    p3.showInfo();
    System.out.println("===================================");
    p4.showInfo();
  }
}
