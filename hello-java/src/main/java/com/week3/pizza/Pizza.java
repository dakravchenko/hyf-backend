package com.week3.pizza;

import java.util.List;

public class Pizza {
    private Size pizzaSize;
    private List<Topping> toppings;

    public Pizza(Size pizzaSize, List<Topping> toppings) {
        this.pizzaSize = pizzaSize;
        this.toppings = toppings;
    }

    // public double getTotalPrice() {
    // double toppingsPrice = 0;
    // for (Topping topping : toppings) {
    // toppingsPrice += topping.getPrice();
    // }
    // return toppingsPrice + pizzaSize.getBasePrice();
    // }

    public double getTotalPrice() {
        double toppingsPrice = (toppings == null) ? 0.0 : toppings.stream().mapToDouble(Topping::getPrice).sum();

        return toppingsPrice + (pizzaSize != null ? pizzaSize.getBasePrice() : 0.0);
    }

    @Override
    public String toString() {
        // toppings??
        return String.format("%s pizza with %s - €%.2f%n", pizzaSize.getSize(),
                toppings.stream().map(topping -> topping.getToppingName()).toList(), getTotalPrice());
    }
}
