package com.week3.pizza;

public enum Size {
    SMALL(6.00, "Small"),
    MEDIUM(9.00, "Medium"),
    LARGE(12.00, "Large");

    private double basePrice;
    private String size;

    Size(double basePrice, String size) {
        this.basePrice = basePrice;
        this.size = size;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public String getSize() {
        return size;
    }
}
