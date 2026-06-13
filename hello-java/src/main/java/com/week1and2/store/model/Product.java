package com.week1and2.store.model;

public class Product {
    private String name;
    private double price;
    private static int totalCreated;

    private static final double MAX_PRICE = 9999.99;

    public String getName() {
        return this.name;
    }

    public double getPrice() {
        return this.price;
    }

    public Product(String name, double price) {
        this.name = name;
        setPrice(price);
        totalCreated++;
    }

    public void setPrice(double price) {
        if (price > MAX_PRICE) {
            this.price = MAX_PRICE;
        } else {
            this.price = price;
        }
    }

    public static int getTotalCreated() {
        return totalCreated;
    }

    public static String formatPrice(double price) {
        return String.format("€" + price);
    }

    @Override
    public String toString() {
        return formatPrice(this.price);
    }

}
