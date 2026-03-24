package com.java.day4;

import java.util.Vector;

public class VectorExample {

    public static void main(String[] args) {
        Vector v = new Vector(3,2);
        // Initial Capacity is 3 and then increment by 2
        System.out.println(v.size());
        System.out.println(v.capacity());
        v.addElement("Raj");
        v.addElement("Mahesh");
        System.out.println(v.size());
        System.out.println(v.capacity());
        v.addElement("Noorey");
        System.out.println(v.size());
        System.out.println(v.capacity());
        v.addElement("Mega");
        System.out.println(v.size());
        System.out.println(v.capacity());
    }
}
