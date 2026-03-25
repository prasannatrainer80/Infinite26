package com.java.lamb;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

public class OptionalExample2 {

    static List<Employ> employs;

    static {
        employs = new ArrayList<>();
        employs.add(new Employ(1,"Bawin",82344.2));
        employs.add(new Employ(2,"Pavithra",99932.44));
        employs.add(new Employ(3,"Niteesh",90023.43));
        employs.add(new Employ(4,"Noorey",90013.22));
        employs.add(new Employ(5,"Aashik",98823.22));
        employs.add(new Employ(6,"Devadarshan",99999));
        employs.add(new Employ(7,"Bavya",98823.22));
        employs.add(new Employ(8,"Naveen",79999.23));
    }

    public Employ searchEmploy(int empno) {
        return employs.stream().filter(x -> x.getEmpno() == empno).findFirst().orElse(null);
    }

    public static void main(String[] args) {
        int empno;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Employ Number  ");
        empno = sc.nextInt();
        OptionalExample2 obj = new OptionalExample2();
        Optional<Employ> result = Optional.ofNullable(obj.searchEmploy(empno));
        if (result.isPresent()) {
            System.out.println(result);
        } else {
            System.out.println("No such employ exists");
        }
    }
}
