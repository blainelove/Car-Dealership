package com.sg.cardealership.model;

public class Specials
{
    private int specialsId;
    private String specialDetails;
    private String title;

    public Specials()
    {
        this.specialsId = 0;
        this.specialDetails = "";
        this.title = "";
    }

    public Specials(int specialsId, String specialDetails, String title)
    {
        this.specialsId = specialsId;
        this.specialDetails = specialDetails;
        this.title = title;
    }

    public int getSpecialsId() {
        return specialsId;
    }

    public void setSpecialsId(int specialsId) {
        this.specialsId = specialsId;
    }

    public String getSpecialDetails() {
        return specialDetails;
    }

    public void setSpecialDetails(String specialDetails) {
        this.specialDetails = specialDetails;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
