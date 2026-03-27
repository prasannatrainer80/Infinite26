package com.java.thrs.locks;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class LockExample {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        Counter counter = new Counter();
        for(int i=0;i<50;i++) {
            executorService.execute(()->counter.increment());
        }
        executorService.shutdown();
        executorService.awaitTermination(1, TimeUnit.SECONDS);
        System.out.println("Final Count  " +counter.count);
    }
}
