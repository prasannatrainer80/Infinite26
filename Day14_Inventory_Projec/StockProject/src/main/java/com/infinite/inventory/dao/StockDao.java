package com.infinite.inventory.dao;

import com.infinite.inventory.model.Stock;

import java.sql.SQLException;
import java.util.List;

public interface StockDao {
  String addStock(Stock stock) throws SQLException, ClassNotFoundException;
  List<Stock> showStock() throws SQLException, ClassNotFoundException;
  Stock searchByStockId(String stockId) throws SQLException, ClassNotFoundException;
}
