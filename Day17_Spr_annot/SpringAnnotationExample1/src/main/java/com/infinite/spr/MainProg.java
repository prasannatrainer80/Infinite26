package com.infinite.spr;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainProg {
  public static void main(String[] args) {

    AnnotationConfigApplicationContext context =
      new AnnotationConfigApplicationContext(AppConfig.class);

    Hello hello = context.getBean("beanHello", Hello.class);
    hello.sayHello("Prasanna");
  }
}
