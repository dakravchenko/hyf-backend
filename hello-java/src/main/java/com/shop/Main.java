package com.shop;

import com.shop.model.Product;
import com.shop.model.Vehicle;

public class Main {
    public static void main(String[] args) {

        // Product car = new Product();

        // Product laptop = new Product("lenovo", 2222.22, 11);

        // // Product errorLaptop = new Product(222, "name")

        // Product course = new Product("java", 0);

        // System.out.println(car.toString());
        // System.out.println(laptop.toString());
        // System.out.println(course.toString());

        Vehicle v1 = new Vehicle();
        Vehicle v2 = new Vehicle();
        Vehicle v3 = new Vehicle();

        System.out.println(Vehicle.getInstanceCount());

    }

}
