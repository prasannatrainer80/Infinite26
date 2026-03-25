package com.java.lamb;

import java.util.ArrayList;
import java.util.List;

public class MapExample1 {
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

        System.out.println("Names in Upper Case ");
        employs.stream().map(x -> x.getName().toUpperCase()).forEach(System.out::println);

        System.out.println("Employee Records After Incr Basic 1000  ");
        employs.stream().map(x -> x.getBasic() + 1000)
                .forEach(System.out::println);
    }
}
