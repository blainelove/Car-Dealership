package com.sg.cardealership.model;

public class BodyStyle
{
    private int bodyStyleId;
    private String bodyStyleType;

    public BodyStyle()
    {
        this.bodyStyleId = 0;
        this.bodyStyleType = "";
    }

    public BodyStyle(int bodyStyleId, String bodyStyleType)
    {
        this.bodyStyleId = bodyStyleId;
        this.bodyStyleType = bodyStyleType;
    }

    public int getBodyStyleId() {
        return bodyStyleId;
    }

    public void setBodyStyleId(int bodyStyleId) {
        this.bodyStyleId = bodyStyleId;
    }

    public String getBodyStyleType() {
        return bodyStyleType;
    }

    public void setBodyStyleType(String bodyStyleType) {
        this.bodyStyleType = bodyStyleType;
    }
}
