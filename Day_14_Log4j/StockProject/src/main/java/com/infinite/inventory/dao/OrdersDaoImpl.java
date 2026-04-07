package com.infinite.inventory.dao;

import com.infinite.inventory.model.Orders;
import com.infinite.inventory.model.Stock;
import com.infinite.inventory.util.ConnectionHelper;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class OrdersDaoImpl implements OrdersDao {

  Connection connection;
  PreparedStatement psmt;

  public String generateOrderId() throws SQLException, ClassNotFoundException {
    connection = ConnectionHelper.getConnection();
    String cmd = "select case when max(orderId) IS NULL THEN " +
      "'O000' ELSE max(orderId) end oid from Orders";
    psmt=connection.prepareStatement(cmd);
    ResultSet rs=psmt.executeQuery();
    rs.next();
    String stockId=rs.getString("oid");
    String sub = stockId.substring(1);
    int id =  Integer.parseInt(sub);
    id++;
    stockId = String.format("O%03d", id);
    return stockId;

  }
  @Override
  public String placeOrder(String stockId,int qtyOrd) throws SQLException, ClassNotFoundException {
    String ordId = generateOrderId();
    connection = ConnectionHelper.getConnection();
    Stock stockFound = new StockDaoImpl().searchByStockId(stockId);
    if (stockFound==null) {
      return "Invalid Stock Id...";
    }
    int qtyAvail = stockFound.getQuantityAvail();
    double price = stockFound.getPrice();
    if(qtyAvail < qtyOrd) {
      return "Insufficient Quantity...";
    }
    double billAmount = price * qtyOrd;
    int balance = qtyAvail - qtyOrd;
    String cmd = "Update Stock set QuantityAvail = ? " +
      " WHERE StockId = ?";
    psmt=connection.prepareStatement(cmd);
    psmt.setInt(1, balance);
    psmt.setString(2, stockId);
    psmt.executeUpdate();
    cmd = "Insert into Orders(OrderId,StockId,QtyOrd,billAmount) " +
      " Values(?,?,?,?)";
    psmt =  connection.prepareStatement(cmd);
    psmt.setString(1, ordId);
    psmt.setString(2, stockId);
    psmt.setInt(3, qtyOrd);
    psmt.setDouble(4, billAmount);
    psmt.executeUpdate();
    cmd = "Update Amount Set Gamt = Gamt + ?";
    psmt = connection.prepareStatement(cmd);
    psmt.setDouble(1, billAmount);
    psmt.executeUpdate();
    return "Order Placed Successfully...";
  }
}
