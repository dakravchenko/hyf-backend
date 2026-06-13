package com.week3.shoppingcart;

import java.math.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class ShoppingCart extends ArrayList<GroceryItem> {

    public List<GroceryItem> getItemsByType(GroceryType type) {

        return this.stream().filter(good -> good.type() == type).toList();

    }

    public Set<String> uniqueItemNames() {
        return this.stream().map(GroceryItem::name).collect(Collectors.toSet());

    }

    public Integer totalItemsCount() {
        return (int) this.stream().map(item -> item.quantity()).reduce(0, (a, b) -> a + b);
    }

    public BigDecimal calculateTotalPrice() {
        BigDecimal total = BigDecimal.ZERO;
        for (GroceryItem good : this) {
            BigDecimal itemTotal = good.discountedIndividualPrice(modCount)
                    .multiply(BigDecimal.valueOf(good.quantity()));
            total = total.add(itemTotal);
        }
        return total;
    }

    public String totalPriceFormatted() {
        return calculateTotalPrice()
                .setScale(GroceryItem.MONEY_SCALE, RoundingMode.HALF_UP)
                .toPlainString();
    }
}
