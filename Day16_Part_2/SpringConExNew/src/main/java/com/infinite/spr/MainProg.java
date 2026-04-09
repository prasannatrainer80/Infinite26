package com.infinite.spr;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainProg {
  public static void main(String[] args) {
    ApplicationContext ctx =
      new ClassPathXmlApplicationContext("hello.xml");
    HelloImpl impl = (HelloImpl)ctx.getBean("beanHello");
    impl.sayHello("Bhavya");
  }
}
