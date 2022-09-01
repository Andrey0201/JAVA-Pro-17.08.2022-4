package com.javapro.lesson4.model;

import java.util.Objects;

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

    @Override
    public AnimalType getAnimalType() {
        return AnimalType.DOG;
    }


    //    @Override
//    public ActionType getActionType(String action) {
//        if (Objects.equals(action, "RUN"))
//            return ActionType.RUN;
//        else if (Objects.equals(action, "SWIM"))
//            return ActionType.SWIM;
//        else
//            return null;
//    }

    @Override
    public ActionType getActionType(String action) {
        return ActionType.valueOf(action);
    }
}