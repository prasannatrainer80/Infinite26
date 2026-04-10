package com.infinite.spr;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainProg4 {
  public static void main(String[] args) {
    AnnotationConfigApplicationContext context =
      new AnnotationConfigApplicationContext("com.infinite.spr");
    ProtoTypeExample pt1 = context.getBean(ProtoTypeExample.class);
    ProtoTypeExample pt2 = context.getBean(ProtoTypeExample.class);

    System.out.println(pt1.hashCode());
    System.out.println(pt2.hashCode());
  }
}
