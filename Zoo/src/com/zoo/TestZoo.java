package com.zoo;

public class TestZoo {
    public static void main(String[] args) {
        Gorilla gorilla = new Gorilla();
        for (int i = 0; i < 3; i++) {
            gorilla.throwSomething();
        }
        for (int i = 0; i < 2; i++) {
            gorilla.eatBananas();
        }
        gorilla.climb();
        gorilla.displayEnergy();

        Bat bat = new Bat();
        for (int i = 0; i < 3; i++) {
            bat.attackTown();
        }
        for (int i = 0; i < 2; i++) {
            bat.eatHumans();
        }
        for (int i = 0; i < 2; i++) {
            bat.fly();
        }
        bat.displayEnergy();
    }
}