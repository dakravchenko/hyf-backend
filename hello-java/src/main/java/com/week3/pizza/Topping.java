package com.week3.pizza;

public enum Topping {
    CHEESE(1.00, "Cheese"),
    MUSHROOMS(1.50, "Mushrooms"),
    PEPPERONI(2.00, "Pepperoni"),
    OLIVES(1.00, "Olives"),
    PINEAPPLE(1.50, "Pineapple");

    private double price;
    private String toppingName;

    Topping(double price, String toppingName) {
        this.price = price;
        this.toppingName = toppingName;
    }

    public double getPrice() {
        return price;
    }

    public String getToppingName() {
        return toppingName;
    }

}
