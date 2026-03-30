package com.java.thrs;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Service6 {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newCachedThreadPool();
        Future<String> future = executor.submit(() -> {
            try {
                for (int i = 1; i <= 20; i++) {
                    System.out.println("Processing Step " + i);
                    Thread.sleep(1000);
                }
                return "Its Done";
            } catch (InterruptedException e) {
                System.out.println("Task Interrupted");
                executor.shutdown();
                return "Task Cancelled";
            }
        });
        try {
            Thread.sleep(4000);
            future.cancel(true);
            System.out.println("Task Gets Cancelled");
            System.out.println(future.get());
        } catch (InterruptedException e) {
            executor.shutdown();
           System.err.println("Thread Interrupted");
        } catch (ExecutionException e) {
            executor.shutdown();
            System.err.println("Thread Interrupted");
        }
        executor.shutdown();
        System.out.println("All Done");
    }
}
