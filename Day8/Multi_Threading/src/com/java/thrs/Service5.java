package com.java.thrs;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Service5 {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newSingleThreadExecutor();
        Future<String> future = executor.submit(() -> {
            for(int i=1;i<=20;i++) {
                System.out.println("Processing Step " +i);
                Thread.sleep(1000);
                if (i==6) {
                    System.out.println("Cancelling the Thread...");
                    Thread.currentThread().interrupt();

                }
            }
           return "Its Done";
        });
        try {
            System.out.println(future.get());
        } catch (InterruptedException e) {
            System.err.println("As per Requirement its interrupted after 5 iteratoins");
            executor.shutdown();
        } catch (ExecutionException e) {
            System.err.println("As per Requirement its interrupted after 5 iteratoins");
            executor.shutdown();
        }
        executor.shutdown();

    }
}
