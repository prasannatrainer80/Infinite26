package com.infinite.spr.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

public class DeleteEmployMain {
  public static void main(String[] args) {
    int empno;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter employ no:");
    empno = sc.nextInt();
    AnnotationConfigApplicationContext context =
      new AnnotationConfigApplicationContext(AppConfig.class);

    EmployDaoImpl dao = context.getBean(EmployDaoImpl.class);
    System.out.println(dao.deleteEmploy(empno));
  }
}
