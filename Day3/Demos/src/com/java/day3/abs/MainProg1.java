package com.java.day3.abs;

public class MainProg1 {
    public static void main(String[] args) {
        Training[] arr = new Training[]
                {
                    new Bavya(),
                    new Dinesh(),
                    new Aashik()
                };
        for(Training t:arr){
            t.name();
            t.email();
        }
    }
}
