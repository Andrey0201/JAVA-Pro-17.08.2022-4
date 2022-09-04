package com.javapro.lesson4.model;

import com.javapro.lesson4.service.AnimalType;

/**
 * в данной реализауии класса Animal создание обьекта Animal не предусмотрено
 */

abstract public class Animal {

    protected String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void run(int distance) {
        if (distance <= getLimitRunDistance()) {
            printPositiveResult("ran", String.valueOf(distance));
        } else {
            printNegativeResult("run ");
        }
    }

    public void swim(int distance) {
        if (distance <= getLimitSwimDistance()) {
            printPositiveResult("swam", String.valueOf(distance));
        } else if (getLimitSwimDistance() <= 0) {
            printExceptionResult("swim");
        } else {
            printNegativeResult("swim");
        }
    }

    abstract void printPositiveResult(String action, String result);

    abstract void printNegativeResult(String action);

    abstract void printExceptionResult(String action);

    abstract int getLimitRunDistance();

    abstract int getLimitSwimDistance();

    public abstract AnimalType getAnimalType();

}



