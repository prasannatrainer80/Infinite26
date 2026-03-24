package com.java.gen;

public class Customer {
    private int custId;
    private String custName;
    private String city;
    private Gender gender;
    private double billAmount;

    public Customer() { }
    public Customer(int custId, String custName, String city, Gender gender, double billAmount) {
        this.custId = custId;
        this.custName = custName;
        this.city = city;
        this.gender = gender;
        this.billAmount = billAmount;
    }

    public int getCustId() {
        return custId;
    }

    public void setCustId(int custId) {
        this.custId = custId;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public double getBillAmount() {
        return billAmount;
    }

    public void setBillAmount(double billAmount) {
        this.billAmount = billAmount;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "custId=" + custId +
                ", custName='" + custName + '\'' +
                ", city='" + city + '\'' +
                ", gender=" + gender +
                ", billAmount=" + billAmount +
                '}';
    }
}
