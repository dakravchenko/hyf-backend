package com.week1and2.shop.model;

public class Vehicle {
    /*
     * ### Exercise 3 — Constructor Chaining
     * 
     * A `Vehicle` class needs three constructors:
     * 
     * - `Vehicle()` — type defaults to `"Unknown"`, speed to `0`, electric to
     * `false`
     * - `Vehicle(String type, int speed)` — electric defaults to `false`
     * - `Vehicle(String type, int speed, boolean electric)`
     * 
     * Write the class using `this()` constructor chaining so that field assignment
     * only happens in the most complete constructor. Add appropriate getters.
     */

    private String type;
    private int speed;
    private boolean electric;
    private static int instanceCount;

    public String getType() {
        return this.type;
    }

    public int getSpeed() {
        return this.speed;
    }

    public boolean isElectric() {
        return this.electric;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setElectric(boolean electric) {
        this.electric = electric;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public Vehicle() {
        this("Unknown", 0, false);

    }

    public Vehicle(String type, int speed) {
        this(type, speed, false);
    }

    public Vehicle(String type, int speed, boolean electric) {
        setElectric(electric);
        setSpeed(speed);
        setType(type);
        instanceCount++;
    }

    public static int getInstanceCount() {
        return instanceCount;
    }

}
