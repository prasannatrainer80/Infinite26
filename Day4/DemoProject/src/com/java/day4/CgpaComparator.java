package com.java.day4;

import java.util.Comparator;

public class CgpaComparator implements Comparator {

    @Override
    public int compare(Object o1, Object o2) {
        Student s1 = (Student)o1;
        Student s2 = (Student)o2;
        if (s1.getCgpa() >= s2.getCgpa()) {
            return 1;
        }
        return -1;
    }
}
