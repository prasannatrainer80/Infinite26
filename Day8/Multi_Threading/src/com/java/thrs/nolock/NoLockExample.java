package com.java.thrs.nolock;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class NoLockExample {

    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        Counter counter = new Counter();
        for(int i=0;i<50;i++) {
            executorService.submit(() ->counter.increment());
        }
        executorService.shutdown();

            executorService.awaitTermination(1, TimeUnit.MINUTES);

        System.out.println("Count is " + counter.count);
    }
}
