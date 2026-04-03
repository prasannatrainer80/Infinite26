package com.infinite.employ;

import com.infinite.employ.util.ConnectionHelper;

import java.sql.Connection;
import java.sql.SQLException;

public class App {

  public static void main(String[] args) {
    try {
      Connection con = ConnectionHelper.getConnection();
      System.out.println("Connected...");
    } catch (ClassNotFoundException e) {
      throw new RuntimeException(e);
    } catch (SQLException e) {
      throw new RuntimeException(e);
    }
  }

}
