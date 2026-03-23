package com.java.day3.abs;

public class MainProg2 {
    public static void main(String[] args) {
        Animal[] arr = new Animal[]
                {
                        new Cow(),
                        new Crocodile(),
                        new Lion()
                };
        for (Animal animal : arr) {
            animal.name();
            animal.type();
        }
    }
}
