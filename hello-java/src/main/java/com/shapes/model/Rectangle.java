package com.shapes.model;

public class Rectangle implements Shape {
    private double width;
    private double height;
    private String shape = "Rectangle";

    public Rectangle(double width, double height) {
        setHeight(height);
        setWidth(width);
    }
    @Override
    public String getShape() {
        return shape;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    public void setHeight(double height) {
        if (height <= 0) {
            throw new IllegalArgumentException("invalid height");
        } else {
            this.height = height;
        }
    }

    public void setWidth(double width) {
        if (width <= 0) {
            throw new IllegalArgumentException("invalid width");
        } else {
            this.width = width;
        }
    }

    @Override
    public double area() {
        return height * width;
    }

    @Override
    public double perimeter() {
        return 2 * (height + width);
    }

}
