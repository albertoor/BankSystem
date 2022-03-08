package models;

import interfaces.IAccount;

public class Account implements IAccount {
    private double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public void deposit(double amount) {

    }

    @Override
    public void withdrawal(double amount) {
        if (amount > balance)
            System.out.println("Fondos insuficientes");
        else
            this.balance -= amount;
    }

    @Override
    public void updateBalance(double newBalance) {

    }

    @Override
    public void accountStatus() {

    }
}
