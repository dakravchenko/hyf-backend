package com.week1and2.animal;

public class Animal implements AnimalInterface {
    private String name;

    public String getName() {
        return name;
    }

    public Animal(String name) {
        this.name = name;
    }

    @Override
    public void performSpecialAction() {
        System.out.println("i m alive");
    }
}
