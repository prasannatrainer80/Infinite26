package com.infinite.bank.dao;

import com.infinite.bank.model.Accounts;

import java.sql.SQLException;

public interface AccountsDao {
  String createAccount(Accounts accounts) throws SQLException, ClassNotFoundException;
  Accounts searchAccount(int accountno) throws SQLException, ClassNotFoundException;
  String updateAccount(int accountNo, String city, String state);
  String depositAccount(int accountNo,double depositAmount) throws SQLException, ClassNotFoundException;
  String withdrawAccount(int accountNo, double withdrawAmount) throws SQLException, ClassNotFoundException;
}
