package com.week1and2.shapes.model;

public interface Shape {
    double area();

    double perimeter();

    String getShape();

    default String describe(String shape, double area, double perimeter) {
        return String.format("%s. area - %.2f, perimeter - %.2f%n", shape, area, perimeter);
    };

}
