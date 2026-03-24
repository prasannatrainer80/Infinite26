package com.java.day4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapExample1 {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put(1,"Devadarshan");
        map.put(2,"Balu");
        map.put(3,"Mega");
        map.put(4,"Noorey");
        map.put(5,"Dhivya");
        int key;
        String result;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Student ID  ");
        key = sc.nextInt();
        result = (String)map.getOrDefault(key,"Not Found");
        System.out.println(result);
    }
}
