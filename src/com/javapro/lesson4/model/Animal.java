package com.javapro.lesson4.model;

/**
 * в ДАНОМ ВАРИАНТЕ реализауии клпаса анимал создан. обьекта анимал не предусмотрено
 */

abstract public class Animal {

    protected String name;
    protected int distanceSwim;
    protected int distanceRun;


    public Animal(String name) {
        this.name = name;
        distanceSwim = getLimitSwimDistance();
        distanceRun = getLimitRunDistance();
    }


    public void run(int distance) {
        if (distance <= distanceRun) {
            printPositiveResult("ran", String.valueOf(distance));
//            System.out.println(name + " ran " + distance + " meters");
        } else {
            printNegativeResult("run ");
//            System.out.println(name + " can't run that much");
        }
    }

    public void swim(int distance) {
        if (distance <= distanceSwim) {
            printPositiveResult("swam", String.valueOf(distance));
//            System.out.println(name + " swam " + distance + " meters");
        } else if (distanceSwim <= 0) {
            printExceptionResult("swim");
//            System.out.println(name + " can't swim");
        } else {
            printNegativeResult("swim");
//            System.out.println(name + " can't swim that much");
        }

    }

    abstract void printPositiveResult(String action, String result);

    abstract void printNegativeResult(String action);

    abstract void printExceptionResult(String action);

    abstract int getLimitRunDistance();

    abstract int getLimitSwimDistance();

}



