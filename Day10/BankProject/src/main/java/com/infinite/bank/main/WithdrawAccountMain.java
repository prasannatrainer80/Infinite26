package com.infinite.bank.main;

import com.infinite.bank.dao.AccountsDao;
import com.infinite.bank.dao.AccountsDaoImpl;

import java.sql.SQLException;
import java.util.Scanner;

public class WithdrawAccountMain {
  public static void main(String[] args) {
    int accountNo;
    double withdrawAmount;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Account No   ");
    accountNo = sc.nextInt();
    System.out.println("Enter Withdraw Amount  ");
    withdrawAmount = sc.nextDouble();
    AccountsDao accountsDao = new AccountsDaoImpl();
    try {
      System.out.println(accountsDao.withdrawAccount(accountNo,withdrawAmount));
    } catch (SQLException e) {
      throw new RuntimeException(e);
    } catch (ClassNotFoundException e) {
      throw new RuntimeException(e);
    }
  }
}
