package com.java.lamb;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateExample2 {
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Devadarshan","Bavya","Naveen",
                "Devadarshan","Naveen","Bawin","Noorey","Mega",
                "Devadarshan","Naveen","Bawin","Noorey","Mega",
                "Devadarshan","Naveen","Bawin","Noorey","Mega",
                "Nitin","Dinesh","Pavithra",
                "Devadarshan","Naveen","Bawin","Noorey","Mega",
                "Nitin","Dinesh","Pavithra"
        );
        /* Create a predicate ensures name ends with 'a' */
        Predicate<String> p1 = (name) -> name.endsWith("a");

        List<String> result = names.stream().distinct()
                .filter(p1).collect(Collectors.toList());
        result.stream().forEach(System.out::println);
    }
}
