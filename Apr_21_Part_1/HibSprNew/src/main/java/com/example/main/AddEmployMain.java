package com.example.main;

import com.example.dao.EmployDao;
import com.example.model.Employ;
import com.example.model.Gender;
import com.example.util.ContextHelper;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

public class AddEmployMain {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Employ employ = new Employ();
    System.out.println("Enter Employ Number   ");
    employ.setEmpno(sc.nextInt());
    System.out.println("Enter Employ Name  ");
    employ.setName(sc.next());
    System.out.println("Enter Gender (MALE/FEMALE)  ");
    employ.setGender(Gender.valueOf(sc.next()));
    System.out.println("Enter Department  ");
    employ.setDept(sc.next());
    System.out.println("Enter Designation  ");
    employ.setDesig(sc.next());
    System.out.println("Enter Basic   ");
    employ.setBasic(sc.nextDouble());
    EmployDao employDao = ContextHelper.getSession();
    employDao.addEmploy(employ);
    System.out.println("*** Employ Record Inserted ***");

  }
}
