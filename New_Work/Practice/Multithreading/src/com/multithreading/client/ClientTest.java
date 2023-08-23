package com.multithreading.client;

import com.multithreading.model.Account;
import com.multithreading.worker.AccountHolder;

public class ClientTest {

    public static void main(String[] args) {

        Account account = new Account();

        AccountHolder accountHolder = new AccountHolder(account);

        Thread t1 = new Thread(accountHolder);
        Thread t2 = new Thread(accountHolder);

        t1.setName("JP");
        t2.setName("BB");

        t1.start();
        t2.start();
    }
}
