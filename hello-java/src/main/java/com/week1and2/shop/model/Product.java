package com.week1and2.shop.model;

public class Product {
    private String name;
    private double price;
    private int stock;

    public Product() {
        this("unknown", 0.0, 0);
    }

    public Product(String name, double price, int stock) {
        setName(name);
        setPrice(price);
        setStock(stock);

    }

    public Product(String name, double price) {
        setName(name);
        setPrice(price);
        setStock(0);
    }

    public int getStock() {
        return stock;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setStock(int stock) {
        if (stock < 0) {
            System.out.println("error");
        } else {
            this.stock = stock;
        }
    }

    public void setPrice(double price) {
        if (price < 0) {
            System.out.println("error");
        } else {
            this.price = price;
        }
    }

    public void setName(String name) {
        if (name == null | name.equals("")) {
            System.out.println("error");
        } else {
            this.name = name;
        }
    }

    @Override
    public String toString() {
        return "Product{name='" + name + "', price='" + price + "', stock='" + stock + "'}";
    }
}
