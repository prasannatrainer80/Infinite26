package com.infinite.inventory.main;

import com.infinite.inventory.dao.StockDao;
import com.infinite.inventory.dao.StockDaoImpl;
import com.infinite.inventory.model.Stock;

import java.sql.SQLException;
import java.util.List;

public class ShowStockMain {
  public static void main(String[] args) {
    StockDao stockDao = new StockDaoImpl();
    try {
      List<Stock> stockList = stockDao.showStock();
      stockList.forEach(System.out::println);
    } catch (SQLException e) {
      throw new RuntimeException(e);
    } catch (ClassNotFoundException e) {
      throw new RuntimeException(e);
    }
  }
}
