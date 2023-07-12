package com.zoo;

public class Gorilla extends Mammal {
    public void throwSomething() {
        System.out.println("Gorilla throws something - probably poo");
        energy -= 5;
    }

    public void eatBananas() {
        System.out.println("Gorilla eats 10 bananas");
        energy += 10;
    }

    public void climb() {
        System.out.println("Gorilla climbs a tree for more bananas");
        energy -= 10;
    }
}