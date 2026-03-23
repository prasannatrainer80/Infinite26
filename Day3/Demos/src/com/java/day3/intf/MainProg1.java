package com.java.day3.intf;

public class MainProg1 {
    public static void main(String[] args) {
        ITraining[] arr = new ITraining[]
                {
                        new Mega(),
                        new Nooray()
                };
        for (ITraining it : arr) {
            it.name();
            it.email();
        }
    }
}
