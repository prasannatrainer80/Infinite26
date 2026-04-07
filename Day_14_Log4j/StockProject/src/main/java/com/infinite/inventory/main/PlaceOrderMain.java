package com.infinite.inventory.main;

import com.infinite.inventory.dao.OrdersDao;
import com.infinite.inventory.dao.OrdersDaoImpl;


import java.sql.SQLException;
import java.util.Scanner;

public class PlaceOrderMain {
  public static void main(String[] args) {
    String stockId;
    int qtyOrd;
    Scanner sc = new  Scanner(System.in);
    System.out.println("Enter Stock ID   ");
    stockId = sc.next();
    System.out.println("Enter Quantity Ordered  ");
    qtyOrd = sc.nextInt();
    OrdersDao ordersDao = new OrdersDaoImpl();
    try {
      System.out.println(ordersDao.placeOrder(stockId,qtyOrd));
    } catch (SQLException e) {
      throw new RuntimeException(e);
    } catch (ClassNotFoundException e) {
      throw new RuntimeException(e);
    }
  }
}
