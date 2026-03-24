package com.java.gen;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortCustomer {
    public static void main(String[] args) {
        SortedSet<Customer> customers = new TreeSet<Customer>();

        customers.add(new Customer(1,"Deva","Chennai", Gender.MALE,84234.23));
        customers.add(new Customer(2,"Dinesh","Coimbatore", Gender.MALE,99933));
        customers.add(new Customer(3,"Mega","Thiruchi", Gender.FEMALE,90233.22));
        customers.add(new Customer(4,"Atchaya","Namakkal", Gender.FEMALE,81111));
        customers.add(new Customer(5,"Pavithra","Tenkasi", Gender.FEMALE,84234.23));
        customers.add(new Customer(6,"Aashik","Thiruchi", Gender.MALE,84234.23));
        customers.add(new Customer(7,"Nithish","Dindigal", Gender.MALE,84234.23));
        customers.add(new Customer(8,"Nooray","Thanzavur", Gender.FEMALE,84234.23));
        customers.add(new Customer(9,"Balu","Velupuram", Gender.MALE,84234.23));
        customers.add(new Customer(10,"Nithish","Dindigal", Gender.MALE,84234.23));
        customers.add(new Customer(11,"Nooray","Thanzavur", Gender.FEMALE,84234.23));
        customers.add(new Customer(12,"Naveen","Vellore", Gender.MALE,84234.23));
        customers.add(new Customer(13,"Bavya","Thanzavur", Gender.FEMALE,84234.23));
        customers.add(new Customer(14,"Bavin","Thiruppur", Gender.MALE,84234.23));
        customers.add(new Customer(15,"Kavya","Madhurai", Gender.FEMALE,84234.23));
        customers.add(new Customer(16,"Dhivya","Thiruppur", Gender.FEMALE,84234.23));

    // Sort By Gender Now the Duplicate Records of Gender
            // Sort by City  Duplicate Records of City Sort  By Name

    }
}
