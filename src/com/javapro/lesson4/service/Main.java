package com.javapro.lesson4.service;

import com.javapro.lesson4.model.ActionType;
import com.javapro.lesson4.model.Animal;
import com.javapro.lesson4.model.Cat;
import com.javapro.lesson4.model.Dog;

import java.util.ArrayList;

public class Main {

    private static Animal[] array = null;

    public static void main(String[] args) {
        createNewAnimals();
        actionAnimal(ActionType.RUN,51);
        actionAnimal(ActionType.SWIM,9);
        personalAnimalAction("Bonya", ActionType.RUN, 9);
        personalAnimalAction("Rem",ActionType.SWIM,8);
        System.out.println("Total animals: " + getTotalCount());
        System.out.println("Total Cat: " + getAnimalListCount().get(0));
        System.out.println("Total Dog: " + getAnimalListCount().get(1));
    }

    /**
     * Метод для создания обьктов Animal
     */
    private static void createNewAnimals() {
        array = new Animal[]{
                new Cat("Shali"),
                new Dog("Rem"),
                new Cat("Bonya"),

        };
    }

    /**
     * Задаем дистанции одновременно всем созданым Animal
     */
    private static void actionAnimal(ActionType actionType, int distance) {
        for (Animal animal : array) {
            switch (actionType) {
                case RUN -> animal.run(distance);
                case SWIM -> animal.swim(distance);
            }
        }
    }

    /**
     * Задаем дистанцию и вид действия персонально для созданого Animal обращаясть по его имени
     */
    private static void personalAnimalAction(String name, ActionType actionType, int distance) {
        for (Animal animal : array) {
            if (animal.getName().equals(name)) {
                switch (actionType) {
                    case RUN -> animal.run(distance);
                    case SWIM -> animal.swim(distance);
                }
                return;
            }

        }
    }

    /**
     * Счет созданых Animal по типу
     */
    private static ArrayList<Integer> getAnimalListCount() {
        ArrayList<Integer> list = new ArrayList();
        int countCat = 0;
        int countDog = 0;

        for (Animal a : array) {
            switch (a.getAnimalType()) {
                case CAT -> countCat++;
                case DOG -> countDog++;
            }
        }
        list.add(countCat);
        list.add(countDog);
        return list;
    }

    /**
     * Счет созданых Animal общий
     */
    private static int getTotalCount() {
        ArrayList<Integer> list = getAnimalListCount();
        int count = 0;
        for (int a : list) {
            count += a;
        }
        return count;
    }
}