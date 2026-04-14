package com.infinite.spr.annotation;

import com.infinite.spr.EmployDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

public class EmploySearchMain {
  public static void main(String[] args) {
    int empno;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Employ Number  ");
    empno = sc.nextInt();
    AnnotationConfigApplicationContext context =
      new AnnotationConfigApplicationContext(AppConfig.class);

    EmployDaoImpl dao = context.getBean(EmployDaoImpl.class);
    Employ employFound = dao.searchEmploy(empno);
    if (employFound != null) {
      System.out.println(employFound);
    } else {
      System.out.println("*** Employ Record Not Found ***");
    }
  }
}
