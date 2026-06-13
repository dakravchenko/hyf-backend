package com.week1and2.shapes.model;

public class Triangle implements Shape {
    private double sideA;

    private double sideB;

    private double sideC;

    private String shape = "Triangle";

    @Override
    public String getShape() {
        return shape;
    }

    public Triangle(double sideA, double sideB, double sideC) {
        setSideA(sideA);
        setSideB(sideB);
        setSideC(sideC);
    }

    public double getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public double getSideC() {
        return sideC;
    }

    public void setSideA(double sideA) {
        if (sideA <= 0) {
            throw new IllegalArgumentException("invalidsideA");
        } else {
            this.sideA = sideA;
        }
    }

    public void setSideB(double sideB) {
        if (sideB <= 0) {
            throw new IllegalArgumentException("invalidsideB " + sideB);
        } else {
            this.sideB = sideB;
        }
    }

    public void setSideC(double sideC) {
        if (sideC <= 0) {
            throw new IllegalArgumentException("invalidsideC " + sideC);
        } else {
            this.sideC = sideC;
        }
    }

    @Override
    public double perimeter() {

        return sideA + sideB + sideC;
    }

    @Override
    public double area() {
        double s = perimeter() / 2;
        return Math.sqrt(
                s * (s - sideA) *
                        (s - sideB) *
                        (s - sideC));
    }
}
