package com.week1and2.vehicles.model;

public class Vehicle {
    private String make;
    private String model;
    private int year;
    private double speed;

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public double getSpeed() {
        return speed;
    }

    public Vehicle(String make, String model, int year) {
        this.make = make.trim();
        this.model = model.trim();
        this.year = year;
        this.speed = 0.0;
    }

    public void accelerate(double amount) {
        if (amount < 0) {
            System.out.println("invalid speed");
            return;
        } else {
            if (this.speed + amount < 0) {
                this.speed = 0;
            } else {
                this.speed += amount;
            }

        }
    }

    public void brake(double amount) {
        if (amount < 0) {
            System.out.println("invalid speed");
            return;
        } else {
            if (this.speed - amount < 0) {
                this.speed = 0;
            } else {
                this.speed -= amount;
            }

        }
    }

    @Override
    public String toString() {
        return String.format("[%d %s %s] Speed: %.2f km/h", year, make, model, speed);
    }

}
