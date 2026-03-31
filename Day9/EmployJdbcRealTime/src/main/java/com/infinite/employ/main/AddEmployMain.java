package com.infinite.employ.main;

import com.infinite.employ.dao.EmployDao;
import com.infinite.employ.dao.EmployDaoImpl;
import com.infinite.employ.model.Employ;
import com.infinite.employ.model.Gender;

import java.sql.SQLException;
import java.util.Scanner;

public class AddEmployMain {
  public static void main(String[] args) {
    Employ employ = new Employ();
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter employ no:");
    employ.setEmpno(sc.nextInt());
    System.out.println("Enter employ name:");
    employ.setName(sc.next());
    System.out.println("Enter employ Gender (MALE/FEMALE) :");
    employ.setGender(Gender.valueOf(sc.next()));
    System.out.println("Enter employ Department  :");
    employ.setDept(sc.next());
    System.out.println("Enter employ Designation :");
    employ.setDesig(sc.next());
    System.out.println("Enter employ Salary :");
    employ.setBasic(sc.nextDouble());
    EmployDao employDao = new EmployDaoImpl();
    try {
      System.out.println(employDao.addEmploy(employ));
    } catch (SQLException e) {
      throw new RuntimeException(e);
    } catch (ClassNotFoundException e) {
      throw new RuntimeException(e);
    }
  }
}
