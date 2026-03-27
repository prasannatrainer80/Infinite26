package com.java.thrs;

import java.time.Year;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.*;

public class ParallelProgramming {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(5);
        executor.submit(() -> {System.out.println("Executor Services are Getting Run...");});

        Future<List<Integer>> future1 =  executor.submit(() -> {
            return Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        });


        /* Create First Future Service */
        Future<List<String>> futureName = executor.submit(() -> {
            System.out.println("List of Names are getting returned...");
            List<String> students = Arrays.asList("Poojitha","Naveen","Deva","Balu","Bawin");
            return students;
        });

        /* Create Second Future Service */
        Future<List<Integer>> futureNumbers = executor.submit(() -> {
            System.out.println("Numbers are Getting Returned");
            return Arrays.asList(1,2,3,4,5);
        });

        Future<Integer> futureMessage =  executor.submit(() -> {
            System.out.println("Hi Its Future Task");
            return 1;
        });

        List<Future<?>> list = Arrays.asList(futureMessage,futureNumbers,futureName,future1);
        for (Future<?> future : list) {
            try {
                System.out.println(future.get());
                Thread.sleep(2000);
            } catch (InterruptedException | ExecutionException e) {}
        }

        executor.shutdown();
        System.out.println("All Done");
    }
}
