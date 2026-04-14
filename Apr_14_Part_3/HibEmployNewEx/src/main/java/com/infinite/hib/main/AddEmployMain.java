package com.infinite.hib.main;

import com.infinite.hib.dao.EmployDao;
import com.infinite.hib.dao.EmployDaoImpl;
import com.infinite.hib.model.Employ;
import com.infinite.hib.model.Gender;

import java.util.Scanner;

public class AddEmployMain {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Employ employ = new Employ();
    System.out.println("Enter Employ Number  ");
    employ.setEmpno(sc.nextInt());
    System.out.println("Enter Name  ");
    employ.setName(sc.next());
    System.out.println("Enter Gender (MALE/FEMALE)  ");
    employ.setGender(Gender.valueOf(sc.next()));
    System.out.println("Enter Department  ");
    employ.setDept(sc.next());
    System.out.println("Enter Designation  ");
    employ.setDesig(sc.next());
    System.out.println("Enter Basic   ");
    employ.setBasic(sc.nextDouble());
    EmployDao employDao = new EmployDaoImpl();
    System.out.println(employDao.addEmploy(employ));
  }
}
