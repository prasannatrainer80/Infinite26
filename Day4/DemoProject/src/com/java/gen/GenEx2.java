package com.java.gen;

import java.util.ArrayList;
import java.util.List;

public class GenEx2 {
    public static void main(String[] args) {
        List<Employ> employList = new ArrayList<>();
        employList.add(new Employ(1,"Atchaya",92342.22));
        employList.add(new Employ(2,"Dinesh",90032.44));
        employList.add(new Employ(3,"Dhivya",91133.22));
        employList.add(new Employ(4,"Mega",99923.22));
        employList.add(new Employ(5,"Deva",89999.22));
//        employList.add(1);
        System.out.println("Employs ");
        for (Employ employ : employList) {
            System.out.println(employ);
        }
    }
}
