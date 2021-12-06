package com.sg.cardealership.model;

public class Transmission
{
    private int transmissionId;
    private String transmissionType;


    public Transmission()
    {
        this.transmissionId = 0;
        this.transmissionType = "";
    }

    public Transmission(int transmissionId, String transmissionType)
    {
        this.transmissionId = transmissionId;
        this.transmissionType = transmissionType;
    }

    public int getTransmissionId() {
        return transmissionId;
    }

    public void setTransmissionId(int transmissionId) {
        this.transmissionId = transmissionId;
    }

    public String getTransmissionType() {
        return transmissionType;
    }

    public void setTransmissionType(String transmissionType) {
        this.transmissionType = transmissionType;
    }
}
