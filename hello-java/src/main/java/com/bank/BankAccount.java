package com.bank;

import com.bank.exception.AccountNotFoundException;
import com.bank.exception.InsufficientFundsException;
import com.bank.exception.TransactionLimitException;

public class BankAccount {
    private double balance = 2200;
    private String accountId;
    private double dailyWithdrawnAmount;
    public static final double DAILY_LIMIT = 2000.00;

    public BankAccount(String accountId, double balance, double dailyWithdrawnAmount) {
        this.accountId = accountId;
        this.balance = balance;
        this.dailyWithdrawnAmount = dailyWithdrawnAmount;
    }

    public String getAccountId() {
        return accountId;
    }

    public double getBalance() {
        return balance;
    }

    public double getDailyWithdrawnAmount() {
        return dailyWithdrawnAmount;
    }

    public static double getDailyLimit() {
        return DAILY_LIMIT;
    }

    public void deposit(double amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Amount cannot be negative");
        } else {
            balance += amount;
        }
    }

    public void withdraw(double amount) throws InsufficientFundsException, TransactionLimitException {
        if (amount < 0) {
            throw new IllegalArgumentException("Amount cannot be negative");
        } else if (amount > balance) {
            throw new InsufficientFundsException(balance, amount);
        } else if (dailyWithdrawnAmount + amount > DAILY_LIMIT) {
            throw new TransactionLimitException(amount, DAILY_LIMIT);
        } else {
            balance -= amount;
            dailyWithdrawnAmount += amount;
        }
    }

    public void transfer(BankAccount target, double amount)
            throws AccountNotFoundException, InsufficientFundsException {
        if (amount < 0) {
            throw new IllegalArgumentException("Amount cannot be negative");
        } else if (target == null) {
            throw new AccountNotFoundException(null);
        } else if (amount > balance) {
            throw new InsufficientFundsException(balance, amount);
        } else {
            balance -= amount;
        }
    }
}