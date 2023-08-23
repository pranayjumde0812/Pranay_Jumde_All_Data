package com.exceptionhandling.customexception;

public class InsufficientAccountBalanceException extends Exception {

    public InsufficientAccountBalanceException(String msg){
//        super(msg);
        System.out.println(msg);
    }

    @Override
    public String getMessage() {
        String info = "Insufficient balance";
        return info;
    }
}
