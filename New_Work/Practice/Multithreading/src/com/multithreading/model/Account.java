package com.multithreading.model;

public class Account {

    private double balance = 12000;

    public double getBalance() {
        return balance;
    }

    public void withDraw(double amount) {

        this.balance = this.balance - amount;
    }



}
