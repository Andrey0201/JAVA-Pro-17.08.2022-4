package com.javapro.lesson4.model;

import com.javapro.lesson4.model.Animal;

public class Dog extends Animal {
    private int distanceLimitRun = 500;
    private int distanceLimitSwim = 10;

    public Dog(String name) {
        super(name);

    }

    @Override
    void printPositiveResult(String action, String result) {
        System.out.println("Dog " + name + " " + action + " " + result + " meters");
    }

    @Override
    void printNegativeResult(String action) {
        System.out.println("Dog " + name + " can't " + action);
    }

    @Override
    void printExceptionResult(String action) {
        System.out.println("Dog " + name + " can't " + action + " that much");
    }

    @Override
    int getLimitRunDistance() {
        return distanceLimitRun;
    }

    @Override
    int getLimitSwimDistance() {
        return distanceLimitSwim;
    }
}