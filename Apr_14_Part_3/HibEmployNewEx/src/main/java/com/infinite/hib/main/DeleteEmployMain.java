package com.infinite.hib.main;

import com.infinite.hib.dao.EmployDao;
import com.infinite.hib.dao.EmployDaoImpl;

import java.util.Scanner;

public class DeleteEmployMain {
  public static void main(String[] args) {
    EmployDao employDao =  new EmployDaoImpl();
    int empno;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter employ no:  ");
    empno = sc.nextInt();
    System.out.println(employDao.deleteEmploy(empno));
  }
}
