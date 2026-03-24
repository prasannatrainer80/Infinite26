package com.java.gen;

import java.util.*;

public class SortEmploy {
    public static void main(String[] args) {
        Comparator comp = new BasicComparator();
//        Comparator comp = new NameComparator();
        SortedSet<Employ> employs = new TreeSet<Employ>(comp);
        employs.add(new Employ(1,"Bawin",82344.2));
        employs.add(new Employ(2,"Pavithra",99932.44));
        employs.add(new Employ(3,"Niteesh",90023.43));
        employs.add(new Employ(4,"Noorey",90013.22));
        employs.add(new Employ(5,"Aashik",98823.22));

        System.out.println("Employ Records Are   ");
        for (Employ e : employs) {
            System.out.println(e);
        }
    }
}
