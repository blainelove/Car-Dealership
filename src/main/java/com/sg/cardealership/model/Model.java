package com.sg.cardealership.model;

public class Model
{
    private int modelId;
    private String modelName;
    private int makeId;
    private int dateAdded;
    private String addedBy;

    public Model()
    {
        this.modelId = 0;
        this.modelName = "";
        this.makeId = 0;
        this.dateAdded = 0;
        this.addedBy = "";
    }

    public Model(int modelId, String modelName, int makeId, int dateAdded, String addedBy)
    {
        this.modelId = modelId;
        this.modelName = modelName;
        this.makeId = makeId;
        this.dateAdded = dateAdded;
        this.addedBy = addedBy;
    }


    public int getModelId() {
        return modelId;
    }

    public void setModelId(int modelId) {
        this.modelId = modelId;
    }

    public String getModelName() {
        return modelName;
    }

    public void setModelName(String modelName) {
        this.modelName = modelName;
    }

    public int getMakeId() {
        return makeId;
    }

    public void setMakeId(int makeId) {
        this.makeId = makeId;
    }

    public int getDateAdded() {
        return dateAdded;
    }

    public void setDateAdded(int dateAdded) {
        this.dateAdded = dateAdded;
    }

    public String getAddedBy() {
        return addedBy;
    }

    public void setAddedBy(String addedBy) {
        this.addedBy = addedBy;
    }
}
