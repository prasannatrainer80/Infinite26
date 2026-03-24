package com.java.gen;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapExample1 {
    public static void main(String[] args) {
        Map<Integer,String> emps = new HashMap<>();
        emps.put(1,"Naveen");
        emps.put(2,"Dinesh");
        emps.put(3,"Dhivya");
        emps.put(4,"Pavithra");
        emps.put(5,"Deva");
//        emps.put("Hi","Hello");
        int key;
        String value;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Employee ID  ");
        key = sc.nextInt();
        value = emps.getOrDefault(key,"Not Found");
        System.out.println("Result is  " +value);
    }
}
