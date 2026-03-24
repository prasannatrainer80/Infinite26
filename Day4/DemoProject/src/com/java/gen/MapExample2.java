package com.java.gen;

import java.util.HashMap;
import java.util.Map;

public class MapExample2 {
    public static void main(String[] args) {
        Map<String,String> users = new HashMap<>();
        users.put("Dinesh","Ramesh");
        users.put("Dhivya","Sundhar");
        users.put("Pavithra","Palsamy");
        users.put("Deva","Jagadeesh");
        for(Map.Entry<String,String> entry : users.entrySet()){
            System.out.println(entry.getKey()+"   "+entry.getValue());
        }
    }
}
