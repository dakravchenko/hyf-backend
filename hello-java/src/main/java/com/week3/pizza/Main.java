package com.week3.pizza;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Order order = new Order();

        order.addPizza(new Pizza(Size.LARGE, List.of(Topping.CHEESE, Topping.MUSHROOMS)));
        order.addPizza(new Pizza(Size.MEDIUM, List.of(Topping.OLIVES, Topping.PINEAPPLE, Topping.PEPPERONI)));
        order.addPizza(new Pizza(Size.SMALL, List.of(Topping.OLIVES, Topping.CHEESE, Topping.PEPPERONI)));

        order.printReceipt();
    }
}
