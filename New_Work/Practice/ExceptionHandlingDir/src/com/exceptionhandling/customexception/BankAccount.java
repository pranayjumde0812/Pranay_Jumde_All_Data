package com.exceptionhandling.customexception;

public class BankAccount {

    private double balance;

    BankAccount(double balance) {
        this.balance = balance;
    }

    public void deposit(double amount) throws MinimumDepositAmountException {
        if (amount < 100)
            throw new MinimumDepositAmountException("Minimum deposit amount is Rs. 100");

        balance = balance + amount;

    }

    public void withdraw(double amount) throws InsufficientAccountBalanceException {

        if (amount > balance)
            throw new InsufficientAccountBalanceException("Insufficient account balance");

        balance = balance - amount;
    }

    public void getBalance() {
        System.out.println("Available balance in your account : "+balance);
    }
}
