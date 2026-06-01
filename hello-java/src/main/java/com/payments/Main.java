package com.payments;

import com.payments.model.BankTransfer;
import com.payments.model.CreditCard;
import com.payments.model.DigitalWallet;

public class Main {
    public static void main(String[] args) {
        PaymentMethod[] payments = new PaymentMethod[] { new CreditCard("Pupkin", 1234), new BankTransfer("De1234"),
                new DigitalWallet("hey", "hey") };
        double totalFee = 0.00;
        double amount = 150.00;

        for (PaymentMethod payment : payments) {
            payment.processPayment(amount);
            System.out.println(payment.getTransactionFee(amount));
            totalFee = totalFee + payment.getTransactionFee(amount);
        }

        System.out.println(totalFee);
    }
}
