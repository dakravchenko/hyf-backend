package com.payments;
public interface PaymentMethod {
    boolean processPayment(double amount);

    String getPaymentType();

    default double getTransactionFee(double amount) {
        return 0.0;
    }
}
