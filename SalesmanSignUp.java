package com.example.inventory_salesmandb;

public class SalesmanSignUp {
    String sUp;
    String sUpass;

    public SalesmanSignUp(String sUp, String sUpass) {
        this.sUp = sUp;
        this.sUpass = sUpass;
    }

    public String getsUp() {
        return sUp;
    }

    public void setsUp(String sUp) {
        this.sUp = sUp;
    }

    public String getsUpass() {
        return sUpass;
    }

    public void setsUpass(String sUpass) {
        this.sUpass = sUpass;
    }
}
