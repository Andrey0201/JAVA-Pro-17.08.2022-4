package com.javapro.lesson4.service;

import com.javapro.lesson4.model.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

    private static Animal[] array = null;
    private static Map<AnimalType, ArrayList<Animal>> map = new HashMap();

    public static void main(String[] args) {
        map.put(AnimalType.CAT,new ArrayList<>());
        map.put(AnimalType.DOG,new ArrayList<>());

      ArrayList<Animal> catList = map.get(AnimalType.CAT);


        createNewAnimals();
        actionAnimal(ActionType.RUN,51);
        actionAnimal(ActionType.RUN,9);
        personalAnimalAction("Bonya",ActionType.RUN, 9);
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
    private static void actionAnimal(ActionType actionType,int distance) {

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