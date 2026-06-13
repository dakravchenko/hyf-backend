package com.week3.pizza;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Order {
    private List<Pizza> pizzas;

    public void addPizza(Pizza pizza) {
        if (pizzas == null) {
            this.pizzas = new ArrayList<Pizza>();
        }
        if (pizza != null) {
            pizzas.add(pizza);
        }
    }

    public double getTotalPrice() {
        if (pizzas == null || pizzas.size() == 0) {
            return 0.0;
        }

        return pizzas.stream().mapToDouble(Pizza::getTotalPrice).sum();

    }

    public void printReceipt() {
        System.out.println("=== Receipt ===");
        pizzas.stream().forEach(pizza -> System.out.println(pizza.toString()));
        System.out.printf("Total: %.2f", getTotalPrice());
    }
}
