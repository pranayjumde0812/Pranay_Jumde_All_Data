package com.exceptionhandling.customexception;

public class AccountMain {

    public static void main(String[] args) {

        BankAccount b = new BankAccount(1200);


        try {
            b.deposit(90);
        } catch (MinimumDepositAmountException e) {
//            System.out.println(e.getMessage());
            e.printStackTrace();
        }


        try {
            b.withdraw(1500);
        } catch (InsufficientAccountBalanceException ex) {
//            System.out.println(ex.getMessage());
            ex.printStackTrace();

        }

        b.getBalance();

    }
}
