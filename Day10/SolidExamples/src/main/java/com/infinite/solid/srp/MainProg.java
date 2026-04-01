package com.infinite.solid.srp;

public class MainProg {
  public static void main(String[] args) {
    EmployDao employDao = new EmployDaoImpl();
    Employ employ1 = new Employ(1, "Dhivya",88323);
    employDao.addEmploy(employ1);
    employDao.showEmploy().forEach(System.out::println);
  }
}
