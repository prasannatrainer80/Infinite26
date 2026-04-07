package com.infinite.inventory.main;

import com.infinite.inventory.dao.StockDao;
import com.infinite.inventory.dao.StockDaoImpl;
import com.infinite.inventory.model.Stock;

import java.sql.SQLException;
import java.util.Scanner;

public class AddStockMain {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    Stock stock = new Stock();
    System.out.println("Enter Item Name  ");
    stock.setItemName(sc.next());
    System.out.println("Enter Price  ");
    stock.setPrice(sc.nextDouble());
    System.out.println("Enter Quantity  ");
    stock.setQuantityAvail(sc.nextInt());
    StockDao stockDao = new StockDaoImpl();
    try {
      System.out.println(stockDao.addStock(stock));
    } catch (SQLException e) {
      throw new RuntimeException(e);
    } catch (ClassNotFoundException e) {
      throw new RuntimeException(e);
    }
  }
}
