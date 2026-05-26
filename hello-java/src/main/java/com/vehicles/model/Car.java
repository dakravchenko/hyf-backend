package com.vehicles.model;

public class Car extends Vehicle {
    private int doors;

    public Car(String make, String model, int year, int doors) {
        super(make, model, year);
        this.doors = doors;
    }

    public void honk() {
        System.out.printf("[%s %s] beep beep!", getMake(), getModel());
    }

    @Override
    public String toString() {
        return String.format("[%d %s %s] Doors: %d | Speed: %.2f km/h", getYear(), getMake(), getModel(), doors,
                getSpeed());
    }
}
