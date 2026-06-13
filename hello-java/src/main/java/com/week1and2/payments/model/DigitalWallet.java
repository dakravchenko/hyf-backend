package com.week1and2.payments.model;

import com.week1and2.payments.PaymentMethod;

public class DigitalWallet implements PaymentMethod {
    private String walletId;
    private String provider;

    public DigitalWallet(String walletId, String provider) {
        this.provider = provider;
        this.walletId = walletId;
    }

    @Override
    public String getPaymentType() {
        return "digital";
    }

    @Override
    public boolean processPayment(double amount) {
        System.out.println("processing...");
        return amount > 0;
    }
}
