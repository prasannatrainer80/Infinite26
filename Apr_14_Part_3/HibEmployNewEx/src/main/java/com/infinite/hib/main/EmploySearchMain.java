package com.infinite.hib.main;

import com.infinite.hib.dao.EmployDao;
import com.infinite.hib.dao.EmployDaoImpl;
import com.infinite.hib.model.Employ;

import java.util.Scanner;

public class EmploySearchMain {
  public static void main(String[] args) {
    int empno;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Employ No   ");
    empno = sc.nextInt();
    EmployDao employDao = new EmployDaoImpl();
    Employ employFound  = employDao.searchEmploy(empno);
    if (employFound !=null) {
      System.out.println(employFound);
    } else {
      System.out.println("*** Employ Record Not Found ***");
    }
  }
}
