package com.week3.basicdebugging;

import java.util.List;

public class Main {
    record Product(String name, Double price, String category, Boolean inStock) {
    }

    public static void main(String[] args) {
        List<Product> products = List.of(
                new Product("iPhone 15", 899.99, "Electronics", true),
                new Product("Wireless Headphones", 79.99, "Electronics", true),
                new Product("Samsung Galaxy", 649.99, "Electronics", false),
                new Product("Coffee Mug", 12.99, "Kitchen", true),
                new Product("Gaming Laptop", 1299.99, "Electronics", true),
                new Product("Office Chair", null, "Furniture", false));

        for (Product product : products) {
            if (product.price() > 70.00) {
                System.out.println(product.name() + " is expensive.");
            }
        }
    }
}
