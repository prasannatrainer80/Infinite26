package com.infinite.spr;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

public class DeleteEmployNewMain {
  public static void main(String[] args) {
    int empno;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Employ Number  ");
    empno = sc.nextInt();
    ApplicationContext ctx = new ClassPathXmlApplicationContext("jdbcnew.xml");
    EmployDaoNew dao = (EmployDaoNew) ctx.getBean("employDaoImpl");
    System.out.println(dao.deleteEmploy(empno));
  }
}
