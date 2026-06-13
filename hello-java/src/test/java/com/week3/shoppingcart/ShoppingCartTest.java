package com.week3.shoppingcart;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ShoppingCartTest {

    private ShoppingCart cart;

    @BeforeEach
    void setUp() {
        cart = new ShoppingCart();
    }

    @Test
    void calculateTotalPrice_applies20PercentDiscountOnFruits() {
        // fail("Arrange items, call calculateTotalPrice(), and assert the BigDecimal
        // total.");
        cart.add(new GroceryItem("Bananas", GroceryType.FRUIT, 4, "1.25"));

        assertEquals(BigDecimal.valueOf(4.60), cart.calculateTotalPrice());

    }

    @Test
    void totalItemsCount_returnsSumOfAllQuantities() {
        cart.add(new GroceryItem("Bananas", GroceryType.FRUIT, 4, "1.25"));
        cart.add(new GroceryItem("Whole Milk", GroceryType.DAIRY, 1, "2.80"));

        assertEquals(5, cart.totalItemsCount());
    }

    @Test
    void getItemsByType_returnsOnlyMatchingItems() {

        cart.add(new GroceryItem("Bananas", GroceryType.FRUIT, 4, "1.25"));
        cart.add(new GroceryItem("Whole Milk", GroceryType.DAIRY, 1, "2.80"));
        cart.add(new GroceryItem("Sourdough Bread", GroceryType.BAKERY, 1, "3.50"));

        List<GroceryItem> expected = List.of(
                new GroceryItem("Bananas", GroceryType.FRUIT, 4, "1.25"));

        assertEquals(expected, cart.getItemsByType(GroceryType.FRUIT));
    }

    @Test
    void uniqueItemNames_returnsAllUniqueNames() {
        cart.add(new GroceryItem("Bananas", GroceryType.FRUIT, 4, "1.25"));
        cart.add(new GroceryItem("Whole Milk", GroceryType.DAIRY, 1, "2.80"));
        cart.add(new GroceryItem("Bananas", GroceryType.FRUIT, 4, "1.25"));
        cart.add(new GroceryItem("Whole Milk", GroceryType.DAIRY, 1, "2.80"));
        Set<String> names = Set.of("Bananas", "Whole Milk");

        assertEquals(names, cart.uniqueItemNames());
    }

    @Test
    void emptyCart_returnsZeroForTotalAndCount() {
        assertEquals(0, cart.calculateTotalPrice().intValue());
        assertEquals(0, cart.totalItemsCount().intValue());
    }
}
