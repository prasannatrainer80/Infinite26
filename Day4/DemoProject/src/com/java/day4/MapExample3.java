package com.java.day4;

import java.util.HashMap;
import java.util.Map;

public class MapExample3 {
    public static void main(String[] args) {
        Map map = new HashMap();
        map.put(1,"Devadarshan");
        map.put(2,"Balu");
        map.put(3,"Mega");
        map.put(4,"Noorey");
        map.put(5,"Dhivya");

        for(Object key : map.keySet()){
            System.out.println(key + " "  + map.get(key));
        }
    }
}
