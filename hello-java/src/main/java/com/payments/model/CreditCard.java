package com.payments.model;

import com.payments.PaymentMethod;

public class CreditCard implements PaymentMethod {
    private String cardHolder;
    private int lastFourDigits;

    public CreditCard(String cardHolder, int lastFourDigits){
        this.cardHolder = cardHolder;
        this.lastFourDigits = lastFourDigits;
    }

    @Override
    public double getTransactionFee(double amount) {
        return (amount * 1.5 / 100);
    }

    @Override
    public String getPaymentType() {
        return "credit card";
    }
    @Override
    public boolean processPayment(double amount) {
        System.out.println("processing...");
        return amount > 0;
    }

}
