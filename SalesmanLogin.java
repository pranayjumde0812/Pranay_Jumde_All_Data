package com.example.inventory_salesmandb;

public class SalesmanLogin {

    String sid;
    String spass;

    public SalesmanLogin(String sid, String spass) {
        this.sid = sid;
        this.spass = spass;
    }

    public String getSid() {
        return sid;
    }

    public void setSid(String sid) {
        this.sid = sid;
    }

    public String getSpass() {
        return spass;
    }

    public void setSpass(String spass) {
        this.spass = spass;
    }
}
