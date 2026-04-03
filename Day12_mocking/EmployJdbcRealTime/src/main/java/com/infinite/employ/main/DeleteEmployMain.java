package com.infinite.employ.main;

import com.infinite.employ.dao.EmployDao;
import com.infinite.employ.dao.EmployDaoImpl;

import java.sql.SQLException;
import java.util.Scanner;

public class DeleteEmployMain {
  public static void main(String[] args) {
    EmployDao employDao = new EmployDaoImpl();
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Employ ID  ");
    int empno = sc.nextInt();
    try {
      System.out.println(employDao.deleteEmploy(empno));
    } catch (SQLException e) {
      throw new RuntimeException(e);
    } catch (ClassNotFoundException e) {
      throw new RuntimeException(e);
    }
  }
}
