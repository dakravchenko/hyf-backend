package com.animal;

public class Cat extends Animal implements AnimalInterface {
    private boolean isIndoor;

    public boolean isIndoor() {
        return isIndoor;
    }

    public Cat(boolean isIndoor) {
        super("random cat");
        this.isIndoor = isIndoor;
    }

    @Override
    public void performSpecialAction() {
        System.out.println("can is purring");

    }

}
