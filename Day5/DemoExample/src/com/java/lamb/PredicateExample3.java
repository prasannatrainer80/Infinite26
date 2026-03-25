package com.java.lamb;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class PredicateExample3 {
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

        /* Make a predicate as Name starts with 'N' */
        Predicate<Employ> p1 = e -> e.getName().startsWith("N");

        System.out.println("Employ Records are (Starts name with 'N')  ");
        employs.stream().filter(p1).forEach(x -> System.out.println(x));
        System.out.println("Employ Records are (Starts name Not with 'N')  ");
        employs.stream().filter(p1.negate()).forEach(x -> System.out.println(x));

        Predicate<Employ> p2 = e -> e.getBasic() >= 90000;
        System.out.println("Employ Records are (Sal > 90000)  ");
        employs.stream().filter(p2).forEach(x -> System.out.println(x));

    }
}
