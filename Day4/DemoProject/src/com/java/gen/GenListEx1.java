package com.java.gen;

import java.util.ArrayList;
import java.util.List;

public class GenListEx1 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Bawin");
        names.add("Pavithra");
        names.add("Niteesh");
        names.add("Deva");
        names.add("Mega");
//        names.add(1);
        System.out.println("Names Are  ");
        for (String name : names) {
            System.out.println(name);
        }
    }
}
