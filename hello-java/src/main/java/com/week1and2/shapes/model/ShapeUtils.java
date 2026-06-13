package com.week1and2.shapes.model;


public class ShapeUtils {

    public static void summarise(Shape[] shapes) {
        int polygonCount = 0;
        int circleCount = 0;
        int rectangleCount = 0;
        int triangleCount = 0;

        double totalPolygonArea = 0.0;
        double totalCircleArea = 0.0;
        double totalRectangleArea = 0.0;
        double totalTriangleArea = 0.0;
        double totalCircleRadius = 0.0;

        for (Shape shape : shapes) {
            if (shape instanceof RegularPolygon) {
                polygonCount++;
                totalPolygonArea += shape.area();
            } else if (shape instanceof Circle) {
                Circle circle = (Circle) shape;
                circleCount++;
                totalCircleArea += shape.area();
                totalCircleRadius += circle.getRadius();
            } else if (shape instanceof Rectangle) {
                rectangleCount++;
                totalRectangleArea += shape.area();
            } else if (shape instanceof Triangle) {
                triangleCount++;
                totalTriangleArea += shape.area();
            }
        }

        if (polygonCount > 0) {
            System.out.printf("RegularPolygon count: %d, average area: %.2f%n",
                    polygonCount, totalPolygonArea / polygonCount);
        }

        if (circleCount > 0) {
            System.out.printf("Circle count: %d, average area: %.2f, average radius: %.2f%n",
                    circleCount, totalCircleArea / circleCount, totalCircleRadius / circleCount);
        }

        if (rectangleCount > 0) {
            System.out.printf("Rectangle count: %d, average area: %.2f%n",
                    rectangleCount, totalRectangleArea / rectangleCount);
        }

        if (triangleCount > 0) {
            System.out.printf("Triangle count: %d, average area: %.2f%n",
                    triangleCount, totalTriangleArea / triangleCount);
        }
    }
}