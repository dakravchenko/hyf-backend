package com.week1and2.vehicles.model;

public class Motorcycle extends Vehicle {
    private boolean hasSidecar;

    public Motorcycle(String make, String model, int year, boolean hasSidecar) {
        super(make, model, year);
        this.hasSidecar = hasSidecar;
    }

    @Override
    public String toString() {
        return String.format("[%d %s %s] Speed: %.2f km/h, with sidecar: %s", getYear(), getMake(), getModel(),
                getSpeed(),
                hasSidecar ? "+" : "-");
    }
}
