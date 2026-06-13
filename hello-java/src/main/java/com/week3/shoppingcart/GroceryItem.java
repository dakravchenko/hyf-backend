package com.week3.shoppingcart;

import java.math.*;

public record GroceryItem(
    String name,
    GroceryType type,
    Integer quantity,
    BigDecimal individualPrice
    
) {
  private static final int PERCENTAGE_DIVISOR_HUNDRED = 100;

  public static final int MONEY_SCALE = 2;

  public GroceryItem(String name, GroceryType type, Integer quantity, String individualPrice) {
    this(name, type, quantity, new BigDecimal(individualPrice));
  }


  /**
   * Safely calculates the new cost after applying the discount percentage.
   * BigDecimal operations are used for 100% accuracy.
   * @param percentage should be between 0 and 100, e.g. 20 for 20% discount
   * @return The BigDecimal instance adjusted with discount
   */
  public BigDecimal discountedIndividualPrice(int percentage) {
	  // Extract the percentage for the "new price". Eg: Discount 20%? Get 80%
    int priceAfterDiscountPercentage = PERCENTAGE_DIVISOR_HUNDRED - percentage;

		// priceAfterDiscountPercentage 80 divided by 100 = 0.8 multiplied with individual price
    return this.individualPrice()
        .multiply(BigDecimal.valueOf(priceAfterDiscountPercentage ))
        .divide(BigDecimal.valueOf(PERCENTAGE_DIVISOR_HUNDRED), MONEY_SCALE, RoundingMode.HALF_UP);
  }


}