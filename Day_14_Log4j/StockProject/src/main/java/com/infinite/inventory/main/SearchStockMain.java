package com.infinite.inventory.main;

import com.infinite.inventory.dao.StockDao;
import com.infinite.inventory.dao.StockDaoImpl;
import com.infinite.inventory.model.Stock;

import java.sql.SQLException;
import java.util.Scanner;

public class SearchStockMain {
  public static void main(String[] args) {
    String stockId;
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter Stock Id  ");
    stockId = sc.nextLine();
    StockDao stockDao = new StockDaoImpl();
    try {
      Stock stockFound = stockDao.searchByStockId(stockId);
      if (stockFound != null) {
        System.out.println(stockFound);
      } else {
        System.out.println("Stock Id Not Found...");
      }
    } catch (SQLException e) {
      throw new RuntimeException(e);
    } catch (ClassNotFoundException e) {
      throw new RuntimeException(e);
    }
  }
}
