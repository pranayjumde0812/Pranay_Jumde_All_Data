package com.entity;

import javax.persistence.*;
import java.util.Arrays;
import java.util.Date;

@Entity
public class Address {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int addressId;

    @Column(name = "street", length = 100)
    private String city;

    private boolean isOpen;
    @Transient
    private double x;

    @Temporal(TemporalType.DATE)
    private Date addedDate;

    @Lob
    private byte[] image;

    public Address(int addressId, String city, boolean isOpen, double x, Date addedDate, byte[] image) {
        this.addressId = addressId;
        this.city = city;
        this.isOpen = isOpen;
        this.x = x;
        this.addedDate = addedDate;
        this.image = image;
    }

    public Address() {
    }

    public int getAddressId() {
        return addressId;
    }

    public void setAddressId(int addressId) {
        this.addressId = addressId;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean open) {
        isOpen = open;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public Date getAddedDate() {
        return addedDate;
    }

    public void setAddedDate(Date addedDate) {
        this.addedDate = addedDate;
    }

    public byte[] getImage() {
        return image;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }

    @Override
    public String toString() {
        return "Address{" +
                "addressId=" + addressId +
                ", city='" + city + '\'' +
                ", isOpen=" + isOpen +
                ", x=" + x +
                ", addedDate=" + addedDate +
                ", image=" + Arrays.toString(image) +
                '}';
    }
}
