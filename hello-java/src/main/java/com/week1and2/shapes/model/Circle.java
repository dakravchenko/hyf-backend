package com.week1and2.shapes.model;

public class Circle implements Shape {
    private double radius;
    private String shape = "Circle";

    @Override
    public String getShape() {
        return shape;
    }

    public Circle(double radius) {
        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException("invalid radius");
        } else {
            this.radius = radius;
        }

    }

    @Override
    public double perimeter() {
        return 2 * Math.PI * radius;
    }

    @Override
    public double area() {

        return Math.PI * radius * radius;
    }

}
