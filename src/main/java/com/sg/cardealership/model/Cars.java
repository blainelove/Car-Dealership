package com.sg.cardealership.model;

import java.math.BigDecimal;

public class Cars
{
    private int carId;
    private boolean isNew;
    private boolean isFeatured;
    private boolean isSold;
    private int mileage;
    private int modelYear;
    private String VIN;
    private int makeId;
    private int modelId;
    private BigDecimal salePrice;
    private BigDecimal msrp;
    private String vehicleDetails;

    private String transmissionType;
    private String intColorName;
    private String bodyColorName;
    private String bodyStyleType;



    public Cars()
    {
        this.carId = 0;
        this.isNew = false;
        this.isFeatured = false;
        this.isSold = false;
        this.mileage = 0;
        this.modelYear = 0;
        this.VIN = "";
        this.makeId = 0;
        this.modelId = 0;
        this.salePrice = BigDecimal.valueOf(0);
        this.msrp = BigDecimal.valueOf(0);
        this.vehicleDetails = "";
        this.transmissionType = "";
        this.intColorName = "";
        this.bodyColorName = "";
        this.bodyStyleType = "";
    }

    public Cars(int carId, boolean isNew, boolean isFeatured, boolean isSold, int mileage, int modelYear,
                String VIN, int makeId, int modelId, BigDecimal salePrice, BigDecimal msrp, String vehicleDetails,
                String transmissionType, String intColor, String extColor, String bodyStyleType)
    {
        this.carId = carId;
        this.isNew = isNew;
        this.isFeatured = isFeatured;
        this.isSold = isSold;
        this.mileage = mileage;
        this.modelYear = modelYear;
        this.VIN = VIN;
        this.makeId = makeId;
        this.modelId = modelId;
        this.salePrice = salePrice;
        this.msrp = msrp;
        this.vehicleDetails = vehicleDetails;
        this.transmissionType = transmissionType;
        this.intColorName = intColor;
        this.bodyColorName = extColor;
        this.bodyStyleType = bodyStyleType;
    }

    public String getTransmissionType() {
        return transmissionType;
    }

    public void setTransmissionType(String transmissionType) {
        this.transmissionType = transmissionType;
    }

    public String getIntColorName() {
        return intColorName;
    }

    public void setIntColorName(String intColorName) {
        this.intColorName = intColorName;
    }

    public String getBodyColorName() {
        return bodyColorName;
    }

    public void setBodyColorName(String bodyColorName) {
        this.bodyColorName = bodyColorName;
    }

    public String getBodyStyleType() {
        return bodyStyleType;
    }

    public void setBodyStyleType(String bodyStyleType) {
        this.bodyStyleType = bodyStyleType;
    }

    public int getCarId() {
        return carId;
    }

    public void setCarId(int carId) {
        this.carId = carId;
    }

    public boolean isNew() {
        return isNew;
    }

    public void setNew(boolean aNew) {
        isNew = aNew;
    }

    public boolean isFeatured() {
        return isFeatured;
    }

    public void setFeatured(boolean featured) {
        isFeatured = featured;
    }

    public boolean isSold() {
        return isSold;
    }

    public void setSold(boolean sold) {
        isSold = sold;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public int getModelYear() {
        return modelYear;
    }

    public void setModelYear(int modelYear) {
        this.modelYear = modelYear;
    }

    public String getVIN() {
        return VIN;
    }

    public void setVIN(String VIN) {
        this.VIN = VIN;
    }

    public int getMakeId() {
        return makeId;
    }

    public void setMakeId(int makeId) {
        this.makeId = makeId;
    }

    public int getModelId() {
        return modelId;
    }

    public void setModelId(int modelId) {
        this.modelId = modelId;
    }

    public BigDecimal getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(BigDecimal salePrice) {
        this.salePrice = salePrice;
    }

    public BigDecimal getMsrp() {
        return msrp;
    }

    public void setMsrp(BigDecimal msrp) {
        this.msrp = msrp;
    }

    public String getVehicleDetails() {
        return vehicleDetails;
    }

    public void setVehicleDetails(String vehicleDetails) {
        this.vehicleDetails = vehicleDetails;
    }
}
