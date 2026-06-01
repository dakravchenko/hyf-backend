package com.bank;

import com.bank.exception.AccountNotFoundException;
import com.bank.exception.InsufficientFundsException;
import com.bank.exception.TransactionLimitException;

public class Main {
    public static void main(String[] args) {
        BankAccount sender = new BankAccount("123", 3000.00, 400.00);
        BankAccount receiver = null;

        try {
            sender.deposit(-55);
        } catch (IllegalArgumentException e) {
            System.out.println("Deposit failed: " + e.getMessage());
        }

        try {
            sender.transfer(receiver, 67);
        } catch (AccountNotFoundException e) {
            System.out.println("Transfer failed: " + e.getMessage());
        } catch (InsufficientFundsException e) {
            System.out.println("Transfer failed: attempted " + e.getAttemptedAmount()
                    + ", available " + e.getAvailableBalance());
        }

        try {
            BankAccount lowBalance = new BankAccount("999", 100.00, 0.00);
            lowBalance.withdraw(150.00);
        } catch (InsufficientFundsException e) {
            System.out.println("Withdrawal failed: attempted " + e.getAttemptedAmount()
                    + ", available " + e.getAvailableBalance());
        } catch (TransactionLimitException e) {
            System.out.println("Withdrawal failed: requested " + e.getRequestedAmount()
                    + ", daily limit " + e.getDailyLimit());
        }

        try {
            sender.withdraw(1700.00); // 400 already withdrawn, so total becomes 2100
        } catch (InsufficientFundsException e) {
            System.out.println("Withdrawal failed: attempted " + e.getAttemptedAmount() 
                    + ", available " + e.getAvailableBalance());
        } catch (TransactionLimitException e) {
            System.out.println("Withdrawal failed: requested " + e.getRequestedAmount()
                    + ", daily limit " + e.getDailyLimit());
        }
    }
}