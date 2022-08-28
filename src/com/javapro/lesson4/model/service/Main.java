package com.javapro.lesson4.model.service;

import com.javapro.lesson4.model.Animal;
import com.javapro.lesson4.model.Cat;
import com.javapro.lesson4.model.Dog;

public class Main {
    private static Animal[] array = new Animal[3];
    private static Animal[] array2 = null;

    public static void main(String[] args) {
        array2 = new Animal[]{
                new Cat("Shali"),
        };

        array[0] = new Cat("Murka");
        Animal cat = new Cat("Bonya");
//        array[1] = cat;
        cat.run(201);
        cat.swim(15);
        Animal dog = new Dog("Rem");
        array[2] = dog;
        dog.swim(9);

        System.out.println("Total animals: " + getTotalCount(array));
//        System.out.println("Total animals: " + getTotalCount()) ;
//        System.out.println("Total animals: " + getTotalCount()) ;
    }

    private static int getTotalCount(Animal[] arr) {
        int count = 0;
        for (Animal a : arr) {
            if (a instanceof Cat) {
                count++;
            }
        }
        return count;
    }
}