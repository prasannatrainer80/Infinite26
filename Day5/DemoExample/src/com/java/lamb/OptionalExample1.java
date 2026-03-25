package com.java.lamb;

import java.util.Arrays;
import java.util.Optional;

public class OptionalExample1 {

    public static void main(String[] args) {
        String[] str = new String[10];
        str[0] = "Devadarshan";
        str[1] = "Naveen";
        str[2] = "Bavya";
        str[3] = "Devadarshan";
        str[4] = "Naveen";
        str[8]="Srikar";
//        System.out.println(str[5]);
        Optional<String> result = Optional.ofNullable(str[5]);
        if (result.isPresent()) {
            System.out.println(str[5]);
        } else {
            System.out.println("*** Value is Not Present ***");
        }
    }
}
