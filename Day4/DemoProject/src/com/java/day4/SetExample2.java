package com.java.day4;

import java.util.LinkedHashSet;
import java.util.Set;

public class SetExample2 {
    public static void main(String[] args) {
        Set names = new LinkedHashSet();
        names.add("Bawin");
        names.add("Pavithra");
        names.add("Naveen");
        names.add("Devadarshan");
        names.add("Kaviya");
        names.add("Balu");
        names.add("Bawin");
        names.add("Pavithra");
        names.add("Naveen");
        names.add("Devadarshan");
        names.add("Kaviya");
        names.add("Bawin");
        names.add("Pavithra");
        names.add("Naveen");
        names.add("Devadarshan");
        names.add("Kaviya");
        names.add("Naveen");
        names.add("Devadarshan");
        names.add("Kaviya");
        names.add("Balu");
        names.add("Naveen");
        names.add("Devadarshan");
        names.add("Kaviya");
        names.add("Balu");
        System.out.println("Names Are  ");
        for(Object name:names){
            System.out.println(name);
        }

    }
}
