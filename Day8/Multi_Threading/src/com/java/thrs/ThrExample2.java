package com.java.thrs;

import java.util.*;

class Third implements Runnable{

    @Override
    public void run() {
        Vector v = new Vector(3,2);
        v.addElement("Mega");
        v.addElement("Dhivya");
        v.addElement("Kaviya");
        v.addElement("Bhavya");
        v.addElement("Naveen");
        v.addElement("Dinesh");
        v.forEach(x -> {
            System.out.println("Vector Data " +x);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
    }
}

class Second implements Runnable{
    @Override
    public void run() {
        Set<String> names = new HashSet<String>();
        names.add("Pavithra");
        names.add("Nitish");
        names.add("Aashik");
        names.add("Deva");
        names.add("Naveen");
        names.add("Balu");
        names.add("Pavithra");
        names.add("Nitish");
        names.add("Aashik");
        names.add("Deva");
        names.add("Naveen");
        names.add("Pavithra");
        names.add("Nitish");
        names.add("Aashik");
        names.add("Deva");
        names.add("Naveen");
        names.add("Nitish");
        names.add("Aashik");
        names.add("Deva");
        names.add("Naveen");
        names.add("Balu");
        names.forEach(x -> {
            System.out.println("HashSet Data " +x);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
    }
}

class First implements Runnable {
    @Override
    public void run() {
        List<String> names = new ArrayList<>();
        names.add("Naveen");
        names.add("Bawin");
        names.add("Noorey");
        names.add("Mega");
        names.add("Atchaya");
        names.add("Dinesh");
        names.forEach(x -> {
            System.out.println("Array List  " +x);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        });
    }
}

public class ThrExample2 {
    public static void main(String[] args) {
        Thread t1 = new Thread(new First());
        Thread t2 = new Thread(new Second());
        Thread t3 = new Thread(new Third());

        t1.start();
        t2.start();
        t3.start();
    }
}
