package com.payments.model;

import com.payments.PaymentMethod;

public class BankTransfer implements PaymentMethod {
    private String iban;

    public BankTransfer(String iban) {
        this.iban = iban;
    }

    @Override
    public double getTransactionFee(double amount) {
        return 0.50;
    }

    @Override
    public String getPaymentType() {
        return "bank transfer";
    }

    @Override
    public boolean processPayment(double amount) {
        System.out.println("processing...");
        return amount > 0;
    }

}
