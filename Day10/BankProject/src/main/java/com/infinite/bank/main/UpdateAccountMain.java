package com.infinite.bank.main;

import com.infinite.bank.dao.AccountsDao;
import com.infinite.bank.dao.AccountsDaoImpl;

import java.util.Scanner;

public class UpdateAccountMain {
  public static void main(String[] args) {
    int accountNo;
    String city, state;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter AccountNo   ");
    accountNo = sc.nextInt();
    System.out.println("Enter City  ");
    city = sc.next();
    System.out.println("Enter State   ");
    state = sc.next();
    AccountsDao accountsDao = new AccountsDaoImpl();
    System.out.println(accountsDao.updateAccount(accountNo, city, state));
  }
}
