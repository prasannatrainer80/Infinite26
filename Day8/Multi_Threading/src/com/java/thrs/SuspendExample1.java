package com.java.thrs;

import javax.swing.plaf.TableHeaderUI;

class MyThread1 implements Runnable {
    @Override
    public void run() {
        for(int i=0;i<=20;i++) {
            System.out.println("Thread is Running " +i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

public class SuspendExample1 {
    public static void main(String[] args) throws InterruptedException {
        MyThread1 t1 = new MyThread1();
        Thread thr1 = new Thread(t1);
        thr1.start();


        Thread.sleep(2000);

//        thr1.suspend();
//
//        Thread.sleep(3000);



    }
}
