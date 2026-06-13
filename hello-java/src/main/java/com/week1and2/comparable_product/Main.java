package com.week1and2.comparable_product;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Product p1 = new Product("A", 11.99, 3);
        Product p2 = new Product("B", 11.99, 3);
        Product p3 = new Product("A", 33.99, 3);
        Product p4 = new Product("C", 11.99, 3);
        Product p5 = new Product("A", 22.99, 3);

        Product[] array = new Product[] { p1, p2, p3, p4, p5 };

        for (Product product : array) {
            System.out.println(product);
        }

        Arrays.sort(array);

        for (Product product : array) {
            System.out.println(product);
        }
    }

}
