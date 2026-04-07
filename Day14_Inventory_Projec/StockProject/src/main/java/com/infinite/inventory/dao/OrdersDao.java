package com.infinite.inventory.dao;

import com.infinite.inventory.model.Orders;

import java.sql.SQLException;

public interface OrdersDao {
  String placeOrder(String stockId,int qtyOrd) throws SQLException, ClassNotFoundException;
}
