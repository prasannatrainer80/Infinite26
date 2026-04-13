package com.infinite.spr;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployShowMain {
  public static void main(String[] args) {
    ApplicationContext ctx = new ClassPathXmlApplicationContext("jdbc.xml");
    EmployDao dao = (EmployDao)ctx.getBean("employDaoImpl");
    dao.showEmploy().forEach(System.out::println);
  }
}
