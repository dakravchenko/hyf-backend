package com.week1and2.animal;

public class AnimalService {
    public static void describeAnimal(Animal animal) {
        System.out.println("Animal: " + animal.getName());
        animal.performSpecialAction();
    }
}
