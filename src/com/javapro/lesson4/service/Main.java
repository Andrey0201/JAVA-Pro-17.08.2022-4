package com.javapro.lesson4.service;

import com.javapro.lesson4.model.Animal;
import com.javapro.lesson4.model.Cat;
import com.javapro.lesson4.model.Dog;

public class Main {

    public static void main(String[] args) {
        Animal cat1 = new Cat("Bonya");
        Animal cat2 = new Cat("Shelli");
        Animal dog1 = new Dog("Rem");

        cat1.run(200);
        cat1.run(250);
        cat1.swim(10);

        dog1.run(488);
        dog1.run(501);
        dog1.swim(10);
        dog1.swim(11);

        cat2.swim(12);
    }
}