package com.java.day1;

import java.util.Arrays;

public class ArrayEx3 {
    public static void main(String[] args) {
        String names ="Deva,Atchaya,Dhivya,Kaviya,Naveen,Balu,Shanmugam";
        String[] res = names.split(",");
        System.out.println("Names Are  ");
        for (String s : res) {
            System.out.println(s);
        }
    }
}
