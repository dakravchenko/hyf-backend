package com.week3.enumtask;

public enum PaymentMethod {
    CREDIT_CARD,
    PAYPAL,
    IDEAL("iDEAL"),
    BANK_TRANSFER;

    private String displayName;
    private double feePercentage;

    PaymentMethod() {
        this.displayName = name(); // default to the enum constant name
        this.feePercentage = 0.0;
    }

    PaymentMethod(String displayName) {
        this.displayName = displayName;
        this.feePercentage = 0.0;
    }

    PaymentMethod(String displayName, double feePercentage) {
        this.displayName = displayName;
        this.feePercentage = feePercentage;
    }

    double calculateFee(double amount) {
        return amount * 0.5;
    }

    public String getDisplayName() {
        return displayName;
    }
}
