package com.infinite.hib.main;

import com.infinite.hib.dao.EmployDao;
import com.infinite.hib.dao.EmployDaoImpl;
import com.infinite.hib.model.Login;

import java.util.Scanner;

public class LoginExample {
  public static void main(String[] args) {
    Login login = new Login();
    String user, pwd;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter UserName and Password  ");
    login.setUserName(sc.next());
    login.setPassCode(sc.next());
    EmployDao dao = new EmployDaoImpl();
    int count = dao.authenticate(login);
    if (count==1) {
      System.out.println("Correct Credentials...");
    } else {
      System.out.println("Invalid Credentials...");
    }
  }
}
