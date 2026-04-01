package com.infinite.bank;

import com.infinite.bank.dao.AccountsDaoImpl;
import com.infinite.bank.util.ConnectionHelper;

import java.sql.Connection;
import java.sql.SQLException;

public class App {

  public static void main(String[] args) {
    try {
      System.out.println(new AccountsDaoImpl().generateAccountNo());
    } catch (SQLException e) {
      throw new RuntimeException(e);
    } catch (ClassNotFoundException e) {
      throw new RuntimeException(e);
    }
//    try {
//      Connection conn = ConnectionHelper.getConnection();
//    } catch (ClassNotFoundException e) {
//      throw new RuntimeException(e);
//    } catch (SQLException e) {
//      throw new RuntimeException(e);
//    }
  }

}
