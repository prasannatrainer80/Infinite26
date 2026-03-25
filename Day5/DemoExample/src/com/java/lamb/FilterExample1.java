package com.java.lamb;

import java.util.ArrayList;
import java.util.List;

public class FilterExample1 {
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

        System.out.println("Employ Records are  ");
        employs.forEach(x -> System.out.println(x));

        System.out.println("Employ Records are  ");
        employs.forEach(System.out::println);

        /* Display Records whose Basic > 90000 */

        System.out.println("Employ Records are (Basic > 90000)  ");
        employs.stream().filter(x -> x.getBasic() >= 90000)
                .forEach(System.out::println);

        /* Display Records whose Name ends with a */
        System.out.println("Employ Records Whose Name Ends with 'a'  ");
        employs.stream().filter(x -> x.getName().endsWith("a"))
                .forEach(System.out::println);

    }
}
