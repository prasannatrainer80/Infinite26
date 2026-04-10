package com.infinite.spr;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainProg {
  public static void main(String[] args) {
    AnnotationConfigApplicationContext ctx =
      new AnnotationConfigApplicationContext(AppConfig.class);

    Person p1 = ctx.getBean("personDinesh", Person.class);
    Person p2 = ctx.getBean("personAkshaya", Person.class);

    p1.showAllInfo();
    p2.showAllInfo();
  }
}
