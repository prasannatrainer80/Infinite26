package com.infinite.spr;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

public class AddEmployNewMain {
  public static void main(String[] args) {
    ApplicationContext ctx = new ClassPathXmlApplicationContext("jdbcnew.xml");
    EmployDaoNew dao =
      (EmployDaoNew) ctx.getBean("employDaoImpl");
    Scanner sc = new Scanner(System.in);
    Employ employ = new Employ();
    System.out.println("Enter Employ Number  ");
    employ.setEmpno(sc.nextInt());
    System.out.println("Enter Employ Name ");
    employ.setName(sc.next());
    System.out.println("Enter Gender (MALE/FEMALE) ");
    employ.setGender(Gender.valueOf(sc.next()));
    System.out.println("Enter Department  ");
    employ.setDept(sc.next());
    System.out.println("Enter Designation  ");
    employ.setDesig(sc.next());
    System.out.println("Enter Basic  ");
    employ.setBasic(sc.nextDouble());
    System.out.println(dao.addEmploy(employ));
  }
}
