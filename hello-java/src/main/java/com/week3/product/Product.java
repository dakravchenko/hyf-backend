package com.week3.product;

public class Product {
    private String name;
    private Category category;
    private double price;
    private boolean inStock;

    public Product(String name, double price, Category category, boolean inStock) {
        this.category = category;
        this.name = name;
        this.price = price;
        this.inStock = inStock;
    }

    public Category getCategory() {
        return category;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
    public boolean isInStock() {
        return inStock;
    }
}
