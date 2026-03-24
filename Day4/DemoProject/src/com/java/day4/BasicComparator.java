package com.java.day4;

import java.util.Comparator;

public class BasicComparator implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Employ emp1 = (Employ)o1;
        Employ emp2 = (Employ)o2;
        if (emp1.getBasic() >= emp2.getBasic()) {
            return 1;
        }
        return -1;
    }
}
