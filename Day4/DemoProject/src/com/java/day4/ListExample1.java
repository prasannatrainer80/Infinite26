package com.java.day4;

import java.util.ArrayList;
import java.util.List;

public class ListExample1 {

    public static void main(String[] args) {
        List names = new ArrayList();
        names.add("Devadarshan");
        names.add("Pavithra");
        names.add("Mega");
        names.add("Kaviya");
        names.add("Dinesh");

        System.out.println("Names are ");
        for(Object name : names){
            System.out.println(name);
        }
        names.add(2,"Balu");
        System.out.println("Names after add operation ");
        for(Object name : names){
            System.out.println(name);
        }

        names.set(2,"Bawin");
        System.out.println("Names after set operation ");
        for(Object name : names){
            System.out.println(name);
        }

        names.remove("Bawin");
        System.out.println("Names after remove operation ");
        for(Object name : names){
            System.out.println(name);
        }
    }
}
