package com.java.lamb;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SortEmploy {
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

        System.out.println("Sorted Employ Records Are    ");
        employs.stream().sorted((e1,e2) -> {
            return e1.getName().compareTo(e2.getName());
        }).forEach(System.out::println);
        System.out.println("Sort Employ Records By Basic-Wise   ");
        employs.stream().sorted((e1,e2) -> {
            return (int) (e1.getBasic() - e2.getBasic());
        }).forEach(System.out::println);

        System.out.println("Print First 5 Records  ");
        employs.stream().limit(5).forEach(System.out::println);

        System.out.println("Display Max. Salary Employ Record  ");
        Employ maxEmp = employs.stream().
            max(Comparator.comparing(Employ::getBasic)).orElse(null);
        System.out.println(maxEmp);

        System.out.println("Display Min. Salary Employ Record  ");
        Employ minEmp = employs.stream().
                min(Comparator.comparing(Employ::getBasic)).orElse(null);
        System.out.println(minEmp);
    }
}
