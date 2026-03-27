package com.java.thrs;

import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Service3 {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(5);
        executor.submit(() -> {System.out.println("Welcome to Service3");});
        Future<List<String>> names = executor.submit(() -> {
            System.out.println("List of Names are getting returned...");
            List<String> students = Arrays.asList("Poojitha","Naveen","Deva","Balu","Bawin");
            return students;
        });

        try {
            for(String str : names.get()) {
                System.out.println(str);
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }

        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        executor.shutdown();
        System.out.println("Service Down Completely...");
    }
}
