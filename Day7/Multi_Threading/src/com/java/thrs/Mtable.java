package com.java.thrs;

class TableEx {
    synchronized void showTable(int n) {
        int p;
        for(int i=1;i<=10;i++) {
            p = n * i;
            System.out.println(n + " * " +i+ " = " + p);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}

class Tab1 implements Runnable {
    TableEx t;
    Tab1(TableEx t) {
        this.t = t;
    }
    public void run() {
        t.showTable(12);
    }
}

class Tab2 implements Runnable {
    TableEx t;
    Tab2(TableEx t) {
        this.t = t;
    }
    public void run() {
        t.showTable(7);
    }
}

class Tab3 implements Runnable {
    TableEx t;
    Tab3(TableEx t) {
        this.t = t;
    }
    public void run() {
        t.showTable(19);
    }
}


public class Mtable {
    public static void main(String[] args) {
        TableEx tabEx = new TableEx();
        Tab1 tab1 = new Tab1(tabEx);
        Tab2 tab2 = new Tab2(tabEx);
        Tab3 tab3 = new Tab3(tabEx);

        Thread t1 = new Thread(tab1);
        Thread t2 = new Thread(tab2);
        Thread t3 = new Thread(tab3);

        t1.start();
        t2.start();
        t3.start();

    }
}
