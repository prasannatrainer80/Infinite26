package com.java.thrs;

import java.util.Random;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Service1 {
    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        executorService.submit(() -> System.out.println("Welcome to Thread Concurrency...!"));
        /* Creare a Future Method */

        Future<Integer> futureTask1 = executorService.submit(() -> {
            System.out.println("Hi Its Future Task");
            return 5;
        });

        try {
            System.out.println( futureTask1.get());
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
        executorService.shutdown();
        System.out.println("Service Down Completely...");
    }
}
