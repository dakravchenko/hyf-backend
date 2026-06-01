package com.animal;

public class Dog extends Animal implements AnimalInterface {
    private String breed;

    public String getBreed() {
        return breed;
    }

    public Dog(String breed) {
        super("random dog name");
        this.breed = breed;
    }

    @Override
    public void performSpecialAction() {
        System.out.println("dog is fetching");

    }

}
