package com.exceptionhandling.customexception;

public class MinimumDepositAmountException extends Exception {

    public MinimumDepositAmountException(String msg){
//        super(msg);
        System.out.println(msg);
    }

    @Override
    public String getMessage() {
        String info = "Add at least minimum amount Rs. 100";
        return info;
    }
}
