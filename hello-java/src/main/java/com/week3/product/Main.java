package com.week3.product;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Product> products = List.of(
                // Product properties: name, price, category, inStock
                new Product("iPhone 15", 899.99, Category.EELECTRONICS, true),
                new Product("Wireless Headphones", 79.99, Category.EELECTRONICS, true),
                new Product("Samsung Galaxy", 649.99, Category.EELECTRONICS, false),
                new Product("Coffee Mug", 12.99, Category.KITCHEN, true),
                new Product("Gaming Laptop", 1299.99, Category.EELECTRONICS, true));

                List<String> result = products.stream()
                .filter(p -> p.isInStock() && p.getCategory() == Category.EELECTRONICS) // enum compare with ==
                .map(p -> p.getName().toUpperCase())
                .sorted()
                .collect(Collectors.toList());
    
            System.out.println(result);
    }
}
