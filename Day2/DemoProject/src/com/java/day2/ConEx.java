package com.java.day2;

public class ConEx {
    static {
        System.out.println("Static Constructor...");
    }
    ConEx() {
        System.out.println("Default Constructor...");
    }
    public static void main(String[] args) {
        ConEx con = new ConEx();
    }
}
