package com.java.day3;

public class SupCon {
    public static void main(String[] args) {
//        Employ emp1 = new Naveen(1,"Naveen",88323);
//        Employ emp2 = new Kaviya(2,"Kaviya",91123);
//        Employ emp3 = new Deva(3,"Deva",99211);
        Employ[] arr = new Employ[]
        {
                new Naveen(1,"Naveen",88323),
                new Kaviya(2,"Kaviya",91123),
                new Deva(3,"Deva",99211)
        };
        for (Employ e : arr) {
            System.out.println(e);
        }
    }
}
