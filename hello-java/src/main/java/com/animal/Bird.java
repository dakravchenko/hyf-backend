package com.animal;

public class Bird extends Animal implements AnimalInterface {
    private boolean canFly;

    public boolean canFly() {
        return canFly;
    }

    public Bird(boolean canFly) {
        super("random bird");
        this.canFly = canFly;
    }

    @Override
    public void performSpecialAction() {
        System.out.println("bird is singing");

    }

}
