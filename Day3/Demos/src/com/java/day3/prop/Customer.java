package com.java.day3.prop;

/**
 * Example for Read-Only Property
 */
public class Customer {

    private int custId;
    private String customerName;
    private String city;
    private double billAmount;

    public Customer(int custId, String customerName, String city, double billAmount) {
        this.custId = custId;
        this.customerName = customerName;
        this.city = city;
        this.billAmount = billAmount;
    }

    public int getCustId() {
        return custId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getCity() {
        return city;
    }

    public double getBillAmount() {
        return billAmount;
    }
}
