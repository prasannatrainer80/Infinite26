package com.java.day3.intf;

public class DemoInfinite implements Infinite {
    @Override
    public void showInfo() {
//        company = "Infinite Ltd...";
        System.out.println("Company is " +company);
        System.out.println("Topic is  " +topic);
        System.out.println("Mode is  " +mode);
    }
}
