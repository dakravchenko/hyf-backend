package com.animal;

public class AnimalService {
    public static void describeAnimal(Animal animal) {
        System.out.println("Animal: " + animal.getName());
        animal.performSpecialAction();
    }
}
