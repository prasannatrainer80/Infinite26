package com.java.lamb;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MapExample2 {
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

        List<Employ> employListResult =
                employs.stream().map(x ->
                        new Employ(x.getEmpno(), x.getName().toUpperCase(),
                                x.getBasic()+1000)
                        ).collect(Collectors.toList());
        employListResult.forEach(System.out::println);
    }
}
