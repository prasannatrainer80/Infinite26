package com.java.lamb;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExample1 {
    public static void main(String[] args) {
        List<Employ> employs = new ArrayList<Employ>();
        employs.add(new Employ(1,"Bawin",82344.2));
        employs.add(new Employ(2,"Pavithra",99932.44));
        employs.add(new Employ(3,"Niteesh",90023.43));
        employs.add(new Employ(4,"Noorey",90013.22));
        employs.add(new Employ(5,"Aashik",98823.22));
        employs.add(new Employ(6,"Devadarshan",99999));
        employs.add(new Employ(7,"Bavya",98823.22));
        employs.add(new Employ(8,"Naveen",79999.23));

        Consumer<Employ> consumer = e -> System.out.println(e);
        employs.forEach(consumer);

        System.out.println("After Increasing Salary");
        Consumer<Employ> c1 = e -> e.setBasic(e.getBasic()+1000);
        employs.forEach(c1);
        employs.forEach(System.out::println);
    }
}
