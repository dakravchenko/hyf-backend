package com.week1and2.shapes.model;

public class RegularPolygon implements Shape {
    private int sides;
    private double sideLength;

    public RegularPolygon(int sides, double sideLength) {
        setSideLength(sideLength);
        setSides(sides);
    }

    public void setSides(int sides) {
        this.sides = sides;
    }

    public int getSides() {
        return sides;
    }

    public double getSideLength() {
        return sideLength;
    }

    public void setSideLength(double sideLength) {
        this.sideLength = sideLength;
    }

    @Override
    public String getShape() {
        return "RegularPolygon";
    }

    @Override
    public double area() {
        return (sides * sideLength * sideLength) /
                (4 * Math.tan(Math.PI / sides));
    }

    @Override
    public double perimeter() {
        return sides * sideLength;
    }
}
