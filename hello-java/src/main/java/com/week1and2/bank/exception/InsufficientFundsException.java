package com.week1and2.bank.exception;

public class InsufficientFundsException extends BankingException {
    private double attemptedAmount;
    private double availableBalance;

    public InsufficientFundsException(double attemptedAmount, double availableBalance) {
        super(String.format(
                "Insufficient funds: attempted %.2f, but available balance is %.2f",
                attemptedAmount, availableBalance));
        this.attemptedAmount = attemptedAmount;
        this.availableBalance = availableBalance;
    }

    public double getAttemptedAmount() {
        return attemptedAmount;
    }

    public double getAvailableBalance() {
        return availableBalance;
    }
}