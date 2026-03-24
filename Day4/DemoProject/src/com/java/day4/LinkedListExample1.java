package com.java.day4;

import java.util.LinkedList;

public class LinkedListExample1 {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add("Nitish");
        list.add("Bavya");
        list.add("Atchaya");
        list.add("Pavithra");
        list.addFirst("Devadarshan");
        list.addLast("NaveenKumar");
        System.out.println("Names Are  ");
        for(Object name : list){
            System.out.println(name);
        }
    }
}
