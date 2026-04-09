package com.infinite.spr;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Date;

public class MainProg {
  public static void main(String[] args) {
    ApplicationContext ctx =
      new ClassPathXmlApplicationContext("hello.xml");
    Hello hello = null;
    Date date = new Date();
    int hr = date.getHours();
    if (hr < 12) {
      hello = (Hello)ctx.getBean("bean1");
    } else if (hr >= 12 && hr < 16) {
      hello = (Hello)ctx.getBean("bean2");
    } else if (hr > 16) {
      hello = (Hello)ctx.getBean("bean3");
    }
    System.out.println(hello.sayHello("Naveen Nehru"));
  }
}
