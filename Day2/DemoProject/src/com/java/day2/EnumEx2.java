package com.java.day2;

import java.util.Scanner;

public class EnumEx2 {
    public static void main(String[] args) {
        OrderStatus o1 = OrderStatus.PENDING;
        System.out.println("Status is "+o1);
        String status;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Status    ");
        status = sc.next();
        if(status.equals("PENDING")){
            o1 = OrderStatus.PENDING;
        } else if(status.equals("ACCEPTED")){
            o1 = OrderStatus.ACCEPTED;
        }  else if(status.equals("REJECTED")){
            o1 = OrderStatus.REJECTED;
        }
        System.out.println("Status is "+o1);
    }
}
