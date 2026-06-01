package com.bank.exception;

public class TransactionLimitException extends BankingException {
    private double requestedAmount;
    private double dailyLimit;

    public TransactionLimitException(double requestedAmount, double dailyLimit) {
        super(String.format(
                "Transaction limit exceeded: requested %.2f, daily limit is %.2f",
                requestedAmount, dailyLimit));
        this.requestedAmount = requestedAmount;
        this.dailyLimit = dailyLimit;
    }

    public double getRequestedAmount() {
        return requestedAmount;
    }

    public double getDailyLimit() {
        return dailyLimit;
    }
}