package com.week1and2.bank.exception;

public class AccountNotFoundException extends BankingException {
    private String accountId;

    public AccountNotFoundException(String accountId) {
        super(String.format("Account not found: %s", accountId));
        this.accountId = accountId;
    }

    public String getAccountId() {
        return accountId;
    }
}