package com.java.day4;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortEmploy {
    public static void main(String[] args) {
//        Comparator comp = new NameComparator();
        Comparator comp = new BasicComparator();
        SortedSet employs = new TreeSet(comp);
        employs.add(new Employ(1,"Bawin",82344.2));
        employs.add(new Employ(2,"Pavithra",99932.44));
        employs.add(new Employ(3,"Niteesh",90023.43));
        employs.add(new Employ(4,"Noorey",90013.22));
        employs.add(new Employ(5,"Aashik",98823.22));
        for(Object ob : employs){
            Employ e = (Employ)ob;
            System.out.println(e);
        }
    }
}
