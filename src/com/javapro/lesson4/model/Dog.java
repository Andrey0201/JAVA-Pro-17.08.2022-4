package com.javapro.lesson4.model;

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
        System.out.println("Dog " + name + " can't " + action + " that much");
    }

    @Override
    void printExceptionResult(String action) {
        System.out.println("Dog " + name + " can't " + action);
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