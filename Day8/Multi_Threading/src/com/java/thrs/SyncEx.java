package com.java.thrs;

class Data {
    synchronized void showMsg(String name) {
        System.out.print("Hello " + name );
        try {
            Thread.sleep(1000);
            System.out.println(" How Are You...");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}

class Nitish implements Runnable {
    Data data;
    Nitish(Data data) {
        this.data = data;
    }
    public void run() {
        data.showMsg("Nitish");
    }
}

class Atchaya implements Runnable {
    Data data;
    Atchaya(Data data) {
        this.data = data;
    }
    public void run() {
        data.showMsg("Atchaya");
    }
}

class Balu implements Runnable {
    Data data;
    Balu(Data data) {
        this.data = data;
    }
    public void run() {
        data.showMsg("Balu");
    }
}
public class SyncEx {
    public static void main(String[] args) {
        Data data = new Data();
        Nitish n = new Nitish(data);
        Balu b = new Balu(data);
        Atchaya a = new Atchaya(data);
        Thread t1 = new Thread(n);
        Thread t2 = new Thread(b);
        Thread t3 = new Thread(a);

        t1.start();
        t2.start();
        t3.start();
    }
}
