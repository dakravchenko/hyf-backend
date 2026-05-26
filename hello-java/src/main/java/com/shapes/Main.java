package com.shapes;

import com.shapes.model.Circle;
import com.shapes.model.Rectangle;
import com.shapes.model.Shape;
import com.shapes.model.Triangle;

public class Main {
    public static void main(String[] args) {
        double totalArea = 0;
        Shape largestAreaShape = null;
        Shape c1 = new Circle(22.9);
        Shape c2 = new Circle(12);
        Shape r1 = new Rectangle(11, 5.9);
        Shape r2 = new Rectangle(2, 6);
        Shape t1 = new Triangle(4.0, 5.8, 8.9);
        Shape t2 = new Triangle(3, 4, 5);

        Shape[] shapes = new Shape[] { c1, c2, r1, r2, t1, t2 };

        for (Shape shape : shapes) {
            totalArea += shape.area();
            if (largestAreaShape == null || shape.area() > largestAreaShape.area()) {
                largestAreaShape = shape;
            }

            System.out.printf("%.2f%n", shape.area());
            System.out.printf("%.2f%n", shape.perimeter());
            System.out.println(shape.describe(shape.getShape(), shape.area(), shape.perimeter()));
        }

        System.out.println(largestAreaShape.describe(largestAreaShape.getShape(), largestAreaShape.area(),
                largestAreaShape.perimeter()));

        System.out.println("total area: " + String.format("%.2f", totalArea));
    }
}
