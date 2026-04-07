package com.infinite.inventory.model;

public class Orders {

  private String orderId;
  private String stockId;
  private int qtyOrd;
  private double billAmount;

  public String getOrderId() {
    return orderId;
  }

  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }

  public String getStockId() {
    return stockId;
  }

  public void setStockId(String stockId) {
    this.stockId = stockId;
  }

  public int getQtyOrd() {
    return qtyOrd;
  }

  public void setQtyOrd(int qtyOrd) {
    this.qtyOrd = qtyOrd;
  }

  public double getBillAmount() {
    return billAmount;
  }

  public void setBillAmount(double billAmount) {
    this.billAmount = billAmount;
  }

  public Orders() {}

  public Orders(String orderId, String stockId, int qtyOrd, double billAmount) {
    this.orderId = orderId;
    this.stockId = stockId;
    this.qtyOrd = qtyOrd;
    this.billAmount = billAmount;
  }

  @Override
  public String toString() {
    return "Orders{" +
      "orderId='" + orderId + '\'' +
      ", stockId='" + stockId + '\'' +
      ", qtyOrd=" + qtyOrd +
      ", billAmount=" + billAmount +
      '}';
  }
}
