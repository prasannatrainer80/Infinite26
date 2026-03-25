package com.java.lamb;

import java.util.Arrays;
import java.util.List;

public class Duplicates {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Devadarshan","Bavya","Naveen",
                "Devadarshan","Naveen","Bawin","Noorey","Mega",
                "Devadarshan","Naveen","Bawin","Noorey","Mega",
                "Devadarshan","Naveen","Bawin","Noorey","Mega",
                "Nitin","Dinesh","Pavithra",
                "Devadarshan","Naveen","Bawin","Noorey","Mega",
                "Nitin","Dinesh","Pavithra"
                );
        System.out.println("Names after Removing the Duplicates ");
        names.stream().distinct().forEach(System.out::println);
    }
}
