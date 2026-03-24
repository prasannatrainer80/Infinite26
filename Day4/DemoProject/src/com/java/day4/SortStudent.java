package com.java.day4;

import java.util.Comparator;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortStudent {
    public static void main(String[] args) {
//        Comparator comp = new StudentNameComparator();
        Comparator comp = new CgpaComparator();
        SortedSet s = new TreeSet(comp);
        s.add(new Student(1,"Naveen","Vellore",8.5));
        s.add(new Student(2,"Devadarshan","Dindigal",9.1));
        s.add(new Student(3,"Balu","Vilupuram",9.2));
        s.add(new Student(4,"Nitish","Dindigal",8.7));
        s.add(new Student(5,"Dinesh","Coimbatore",9.8));

        System.out.println("Student Records Are  ");
        for(Object o : s){
            Student student = (Student) o;
            System.out.println(student);
        }
    }
}
