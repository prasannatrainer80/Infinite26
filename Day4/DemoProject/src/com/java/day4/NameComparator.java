package com.java.day4;

import java.util.Comparator;

public class NameComparator implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
       Employ emp1 = (Employ)o1;
       Employ emp2 = (Employ)o2;
       return emp2.getName().compareTo(emp1.getName());
    }
}
