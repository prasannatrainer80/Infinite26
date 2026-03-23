package com.java.day3.abs;

public class MainProg3 {
    public static void main(String[] args) {
        Employ[] emps =  new Employ[]{
           new Balu(1,"Balu",82344),
           new Atchaya(2,"Atchaya",82353),
           new Nitish(3,"Nitish",82344)
        };
        for (Employ e : emps) {
            System.out.println(e);
        }
    }
}
