package com.java.day4;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortExample1 {
    public static void main(String[] args) {
        SortedSet names = new TreeSet();
        names.add("Niteesh");
        names.add("Noorey");
        names.add("Aashik");
        names.add("Ashish");
        names.add("Bawin");
        names.add("Balu");
        names.add("Atchaya");
        names.add("Mega");
        System.out.println("Names Are   ");
        for(Object ob : names) {
            System.out.println(ob);
        }
    }
}
