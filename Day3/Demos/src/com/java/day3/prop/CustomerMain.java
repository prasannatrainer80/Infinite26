package com.java.day3.prop;

/**
 * Example for ReadOnly Property
 */
public class CustomerMain {
    public static void main(String[] args) {
        Customer customer = new
                Customer(1, "Naveen",
                "Hyderabad",87114.21);
        System.out.println("Customer Id  " +customer.getCustId());
        System.out.println("Customer Name " +customer.getCustomerName());
        System.out.println("Customer City  " +customer.getCity());
        System.out.println("Customer Bill Amount " +customer.getBillAmount());
    }
}
