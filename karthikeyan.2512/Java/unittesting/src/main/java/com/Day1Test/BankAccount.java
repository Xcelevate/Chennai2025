package com.Day1Test;

public class BankAccount {
    private int balance = 0;

    public BankAccount(int balance) {
        this.balance = balance;
    }
    public BankAccount() {}
    public void deposit(int amount) {
        if(amount < 0) throw new IllegalArgumentException();
        balance += amount;
    }

    public void withdraw(int amount) {
        if (amount > balance) {
            throw new IllegalArgumentException("Insufficient funds");
        }

        balance -= amount;
    }

    public int getBalance() {
        return balance;
    }
}
