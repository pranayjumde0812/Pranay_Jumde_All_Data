package com.multithreading.worker;

import com.multithreading.model.Account;

public class AccountHolder implements Runnable {

    private final Account account;

    public AccountHolder(Account account) {
        this.account = account;
    }

    @Override
    public void run() {

        for (int i = 0; i < 8; i++) {

            if (account.getBalance() <= 0) {
                System.out.println("Your account is withdrawn!!!");
            }
            withdraw(2000.00);
        }
    }

    private void withdraw(double amount) {

        synchronized (AccountHolder.class) {
            if (account.getBalance() >= amount) {
                System.out.println(Thread.currentThread().getName() + " is going to withdraw Rs. " + amount);

                try {
                    Thread.sleep(3000);
                } catch (Exception ex) {
                    ex.printStackTrace();
                }

                account.withDraw(amount);
                System.out.println(Thread.currentThread().getName() + " is going to complete the withdraw.");
            } else {
                System.out.println("Not enough in account for " + Thread.currentThread().getName() + " to withdraw " + account.getBalance());
            }
        }

        System.out.println("------------------------------------------------------");

    }
}
