package com.infinite.bank.main;

import com.infinite.bank.dao.AccountsDao;
import com.infinite.bank.dao.AccountsDaoImpl;

import java.sql.SQLException;
import java.util.Scanner;

public class DepositAccountMain {
  public static void main(String[] args) {
    int accountNo;
    double depositAmount;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Account No   ");
    accountNo = sc.nextInt();
    System.out.println("Enter Deposit Amount  ");
    depositAmount = sc.nextDouble();
    AccountsDao accountsDao = new AccountsDaoImpl();
    try {
      System.out.println(accountsDao.depositAccount(accountNo,depositAmount));
    } catch (SQLException e) {
      throw new RuntimeException(e);
    } catch (ClassNotFoundException e) {
      throw new RuntimeException(e);
    }
  }
}
