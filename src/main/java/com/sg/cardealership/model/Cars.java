package com.sg.cardealership.model;

import java.math.BigDecimal;

public class Cars
{
    private int carId;
    private boolean isNew;
    private boolean isFeatured;
    private boolean isSold;
    private int unitsInStock;
    private int mileage;
    private int modelYear;
    private String VIN;
    private int makeId;
    private int modelId;
    private int transmissionId;
    private int bodyStyleId;
    private int bodyColorId;
    private int intColorId;
    private BigDecimal salePrice;
    private BigDecimal msrp;
    private String vehicleDetails;



    public Cars()
    {
        this.carId = 0;
        this.isNew = false;
        this.isFeatured = false;
        this.isSold = false;
        this.unitsInStock = 0;
        this.mileage = 0;
        this.modelYear = 0;
        this.VIN = "";
        this.makeId = 0;
        this.modelId = 0;
        this.transmissionId = 0;
        this.bodyStyleId = 0;
        this.bodyColorId = 0;
        this.intColorId = 0;
        this.salePrice = BigDecimal.valueOf(0);
        this.msrp = BigDecimal.valueOf(0);
        this.vehicleDetails = "";
    }

    public Cars(int carId, boolean isNew, boolean isFeatured, boolean isSold,
                int unitsInStock, int mileage, int modelYear, String VIN,
                int makeId, int modelId, int transmissionId, int bodyStyleId,
                int bodyColorId, int intColorId, BigDecimal salePrice, BigDecimal msrp, String vehicleDetails)
    {
        this.carId = carId;
        this.isNew = isNew;
        this.isFeatured = isFeatured;
        this.isSold = isSold;
        this.unitsInStock = unitsInStock;
        this.mileage = mileage;
        this.modelYear = modelYear;
        this.VIN = VIN;
        this.makeId = makeId;
        this.modelId = modelId;
        this.transmissionId = transmissionId;
        this.bodyStyleId = bodyStyleId;
        this.bodyColorId = bodyColorId;
        this.intColorId = intColorId;
        this.salePrice = salePrice;
        this.msrp = msrp;
        this.vehicleDetails = vehicleDetails;
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

    public int getUnitsInStock() {
        return unitsInStock;
    }

    public void setUnitsInStock(int unitsInStock) {
        this.unitsInStock = unitsInStock;
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

    public int getTransmissionId() {
        return transmissionId;
    }

    public void setTransmissionId(int transmissionId) {
        this.transmissionId = transmissionId;
    }

    public int getBodyStyleId() {
        return bodyStyleId;
    }

    public void setBodyStyleId(int bodyStyleId) {
        this.bodyStyleId = bodyStyleId;
    }

    public int getBodyColorId() {
        return bodyColorId;
    }

    public void setBodyColorId(int bodyColorId) {
        this.bodyColorId = bodyColorId;
    }

    public int getIntColorId() {
        return intColorId;
    }

    public void setIntColorId(int intColorId) {
        this.intColorId = intColorId;
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
