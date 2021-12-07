package com.sg.cardealership.model;

import java.time.LocalDate;

public class Make
{
    private int makeId;
    private String makeName;
    private LocalDate dateAdded;
    private String addedBy;


    public Make()
    {
        this.makeId = 0;
        this.makeName = "";
        this.dateAdded = null;
        this.addedBy = "";
    }

    public Make(int makeId, String makeName, LocalDate dateAdded, String addedBy)
    {
        this.makeId = makeId;
        this.makeName = makeName;
        this.dateAdded = dateAdded;
        this.addedBy = addedBy;
    }

    public int getMakeId() {
        return makeId;
    }

    public void setMakeId(int makeId) {
        this.makeId = makeId;
    }

    public String getMakeName() {
        return makeName;
    }

    public void setMakeName(String makeName) {
        this.makeName = makeName;
    }

    public LocalDate getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(LocalDate dateAdded) {
        this.dateAdded = dateAdded;
    }

    public String getAddedBy() {
        return addedBy;
    }

    public void setAddedBy(String addedBy) {
        this.addedBy = addedBy;
    }
}
