package com.example.main;

import com.example.dao.EmployDao;
import com.example.model.Employ;
import com.example.util.ContextHelper;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.Scanner;

public class EmploySearchMain {
  public static void main(String[] args) {
    EmployDao employDao = ContextHelper.getSession();
    int empno;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter employ no:");
    empno = sc.nextInt();
    Employ employFound =  employDao.showEmploy(empno);
    if (employFound != null) {
      System.out.println(employFound);
    } else {
      System.out.println("*** Employ Record Not Found ***");
    }
  }
}
