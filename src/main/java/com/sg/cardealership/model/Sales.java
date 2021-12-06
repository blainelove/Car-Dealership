package com.sg.cardealership.model;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class Sales
{
    private int purchaseLogId;
    private String purchaseType;
    private String purchaserName;
    private int carId;
    private String addressOne;
    private String addressTwo;
    private String city;
    private String email;
    private String phone;
    private String zipCode;
    private BigDecimal purchasePrice;
    private LocalDate dateSold;


    public Sales()
    {
        this.purchaseLogId = 0;
        this.purchaseType = "";
        this.purchaserName = "";
        this.carId = 0;
        this.addressOne = "";
        this.addressTwo = "";
        this.city = "";
        this.email = "";
        this.phone = "";
        this.zipCode = "";
        this.purchasePrice = BigDecimal.valueOf(0);
        this.dateSold = null;
    }

    public Sales(int purchaseLogId, String purchaseType, String purchaserName,
                 int carId, String addressOne, String addressTwo, String city,
                 String email, String phone, String zipCode, BigDecimal purchasePrice, LocalDate dateSold)
    {
        this.purchaseLogId = purchaseLogId;
        this.purchaseType = purchaseType;
        this.purchaserName = purchaserName;
        this.carId = carId;
        this.addressOne = addressOne;
        this.addressTwo = addressTwo;
        this.city = city;
        this.email = email;
        this.phone = phone;
        this.zipCode = zipCode;
        this.purchasePrice = purchasePrice;
        this.dateSold = dateSold;
    }

    public int getPurchaseLogId() {
        return purchaseLogId;
    }

    public void setPurchaseLogId(int purchaseLogId) {
        this.purchaseLogId = purchaseLogId;
    }

    public String getPurchaseType() {
        return purchaseType;
    }

    public void setPurchaseType(String purchaseType) {
        this.purchaseType = purchaseType;
    }

    public String getPurchaserName() {
        return purchaserName;
    }

    public void setPurchaserName(String purchaserName) {
        this.purchaserName = purchaserName;
    }

    public int getCarId() {
        return carId;
    }

    public void setCarId(int carId) {
        this.carId = carId;
    }

    public String getAddressOne() {
        return addressOne;
    }

    public void setAddressOne(String addressOne) {
        this.addressOne = addressOne;
    }

    public String getAddressTwo() {
        return addressTwo;
    }

    public void setAddressTwo(String addressTwo) {
        this.addressTwo = addressTwo;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getZipCode() {
        return zipCode;
    }

    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }

    public BigDecimal getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(BigDecimal purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public LocalDate getDateSold() {
        return dateSold;
    }

    public void setDateSold(LocalDate dateSold) {
        this.dateSold = dateSold;
    }
}
