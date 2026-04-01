package com.infinite.bank.main;

import com.infinite.bank.dao.AccountsDao;
import com.infinite.bank.dao.AccountsDaoImpl;
import com.infinite.bank.model.Accounts;

import java.sql.SQLException;
import java.util.Scanner;

public class CreateAccountMain {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Accounts accounts = new Accounts();
    AccountsDao accountsDao = new AccountsDaoImpl();
    System.out.println("Enter First Name  ");
    accounts.setFirstName(sc.next());
    System.out.println("Enter Last Name  ");
    accounts.setLastName(sc.next());
    System.out.println("Enter City  ");
    accounts.setCity(sc.next());
    System.out.println("Enter State  ");
    accounts.setState(sc.next());
    System.out.println("Enter Amount  ");
    accounts.setAmount(sc.nextDouble());
    System.out.println("Enter CheqFacil (Yes/No)   ");
    accounts.setCheqFacil(sc.next());
    System.out.println("Enter Account Type (Savings/Current) ");
    accounts.setAccountType(sc.next());
    try {
      System.out.println(accountsDao.createAccount(accounts));
    } catch (SQLException e) {
      throw new RuntimeException(e);
    } catch (ClassNotFoundException e) {
      throw new RuntimeException(e);
    }
  }
}
