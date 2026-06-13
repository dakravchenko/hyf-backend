package com.week3.shoppingcart;

public class Main {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.add(new GroceryItem("Bananas", GroceryType.FRUIT, 4, "1.25"));
        cart.add(new GroceryItem("Whole Milk", GroceryType.DAIRY, 1, "2.80"));
        cart.add(new GroceryItem("Sourdough Bread", GroceryType.BAKERY, 1, "3.50"));

        System.out.println("Total: €" + cart.totalPriceFormatted());
        System.out.println("Total Items in Cart: " + cart.totalItemsCount());
        System.out.println("Fruit groceries: " + cart.getItemsByType(GroceryType.FRUIT));
        System.out.println("Grocery item names: " + cart.uniqueItemNames());
    }
}
