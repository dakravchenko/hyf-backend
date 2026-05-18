package com.utils;

public class AppConstants {
    public static final int MAX_CART_ITEMS = 50;
    public static final double F_S_T = 49.99;
    public static final String DEFAULT_CURRENCY = "EUR";
    public static final double VAT_RATE = 0.21;

    public static double calculateTotal(double price, int quantity) {
        return price * quantity * VAT_RATE;
    }
}
