package com.week3.product;

public enum Category {
    EELECTRONICS("Electronics"),
    KITCHEN("Kitchen");

    private final String displayName;

    Category(String displayName) {
        this.displayName = displayName;
    }
}
