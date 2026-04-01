package com.infinite.bank.main;

import com.infinite.bank.dao.AccountsDao;
import com.infinite.bank.dao.AccountsDaoImpl;
import com.infinite.bank.model.Accounts;

import java.sql.SQLException;
import java.util.Scanner;

public class SearchAccountMain {
  public static void main(String[] args) {
    int accountNo;
    Scanner sc = new  Scanner(System.in);
    System.out.println("Enter Account No   ");
    accountNo = sc.nextInt();
    AccountsDao dao = new AccountsDaoImpl();
    try {
      Accounts accountFound = dao.searchAccount(accountNo);
      if (accountFound != null) {
        System.out.println(accountFound);
      } else {
        System.out.println("Account No Does Not Exist...");
      }
    } catch (SQLException e) {
      throw new RuntimeException(e);
    } catch (ClassNotFoundException e) {
      throw new RuntimeException(e);
    }
  }
}
