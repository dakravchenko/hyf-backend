package com.bank;

public class BankAccount {
    private double balance;
    private String owner;
    private int pin;

    public BankAccount(String owner, int pin) {
        setOwner(owner);
        this.pin = pin;
    }

    public void withdraw(double amount) {
        if(this.balance - amount >= 0){
            this.balance = this.balance - amount;
        } else {
            System.out.println("not enough money");
        }
        
    }

    public void setOwner(String owner){
        if(owner == null || owner.equals("")){
            System.out.println("owner not valid");
        } else {
            this.owner = owner;
        }

    }

    public void setPin(int pin){
        String stringifiedPin = Integer.toString(pin);

        if(stringifiedPin == null || stringifiedPin.length() != 4){
            System.out.println("must consist of 4 digits");
        } else {
            this.pin = pin;
        }
    }

    
}