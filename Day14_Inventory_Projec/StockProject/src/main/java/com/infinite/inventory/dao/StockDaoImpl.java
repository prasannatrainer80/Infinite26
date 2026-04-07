package com.infinite.inventory.dao;

import com.infinite.inventory.model.Stock;
import com.infinite.inventory.util.ConnectionHelper;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StockDaoImpl implements StockDao {

  Connection conn;
  PreparedStatement psmt;

  public String generateStockId() throws SQLException, ClassNotFoundException {
    conn = ConnectionHelper.getConnection();
    String cmd = "select case when max(stockId) IS NULL THEN " +
      "'S000' ELSE max(stockId) end sid from Stock";
    psmt=conn.prepareStatement(cmd);
    ResultSet rs=psmt.executeQuery();
    rs.next();
    String stockId=rs.getString("sid");
    String sub = stockId.substring(1);
    int id =  Integer.parseInt(sub);
    id++;
    stockId = String.format("S%03d", id);
    return stockId;
  }
  @Override
  public String addStock(Stock stock) throws SQLException, ClassNotFoundException {
    conn = ConnectionHelper.getConnection();
    String sid = generateStockId();
    stock.setStockId(sid);
    String cmd = "Insert into Stock(StockId,ItemName," +
      "Price,QuantityAvail) values(?,?,?,?)";
    psmt=conn.prepareStatement(cmd);
    psmt.setString(1, sid);
    psmt.setString(2, stock.getItemName());
    psmt.setDouble(3, stock.getPrice());
    psmt.setInt(4, stock.getQuantityAvail());
    psmt.executeUpdate();
    return "Stock Item Added with Id  " +sid;
  }

  @Override
  public List<Stock> showStock() throws SQLException, ClassNotFoundException {
    conn = ConnectionHelper.getConnection();
    String cmd = "select * from Stock";
    psmt = conn.prepareStatement(cmd);
    ResultSet rs=psmt.executeQuery();
    Stock stock = null;
    List<Stock> stockList = new ArrayList<Stock>();
    while (rs.next()) {
      stock = new Stock();
      stock.setStockId(rs.getString("StockId"));
      stock.setItemName(rs.getString("ItemName"));
      stock.setPrice(rs.getDouble("price"));
      stock.setQuantityAvail(rs.getInt("QuantityAvail"));
      stockList.add(stock);
    }
    return stockList;
  }

  @Override
  public Stock searchByStockId(String stockId) throws SQLException, ClassNotFoundException {
    conn = ConnectionHelper.getConnection();
    String cmd = "select * from Stock WHERE StockId = ?";
    psmt = conn.prepareStatement(cmd);
    psmt.setString(1,stockId);
    ResultSet rs=psmt.executeQuery();
    Stock stock = null;
    if (rs.next()) {
      stock = new Stock();
      stock.setStockId(rs.getString("StockId"));
      stock.setItemName(rs.getString("ItemName"));
      stock.setPrice(rs.getDouble("price"));
      stock.setQuantityAvail(rs.getInt("QuantityAvail"));
    }
    return stock;
  }
}
