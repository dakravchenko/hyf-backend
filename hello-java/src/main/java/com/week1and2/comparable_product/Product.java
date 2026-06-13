package com.week1and2.comparable_product;

public class Product implements Comparable<Product> {
    private String name;
    private double price;
    private int stock;

    public Product(String name, double price, int stock) {
        setName(name);
        setPrice(price);
        setStock(stock);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or empty");
        }
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price < 0) {
            throw new IllegalArgumentException("Price cannot be negative");
        }
        this.price = price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        if (stock < 0) {
            throw new IllegalArgumentException("Stock cannot be negative");
        }
        this.stock = stock;
    }

    @Override
    public int compareTo(Product other) {

        int priceComparison = Double.compare(this.price, other.price);

        if (priceComparison != 0) {
            return priceComparison;
        }
        return this.name.compareTo(other.name);
    }

    @Override
    public String toString() {
        return String.format("name: %s, price: %.2f", this.name, this.price);
    }
}
