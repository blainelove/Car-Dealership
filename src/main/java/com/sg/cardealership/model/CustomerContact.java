package com.sg.cardealership.model;

public class CustomerContact
{
    private int contactId;
    private String contactName;
    private String messageBody;
    private String email;
    private String phone;

    public CustomerContact()
    {
        this.contactId = 0;
        this.contactName = "";
        this.messageBody = "";
        this.email = "";
        this.phone = "";
    }

    public CustomerContact(int contactId, String contactName, String messageBody, String email, String phone)
    {
        this.contactId = contactId;
        this.contactName = contactName;
        this.messageBody = messageBody;
        this.email = email;
        this.phone = phone;
    }

    public int getContactId() {
        return contactId;
    }

    public void setContactId(int contactId) {
        this.contactId = contactId;
    }

    public String getContactName() {
        return contactName;
    }

    public void setContactName(String contactName) {
        this.contactName = contactName;
    }

    public String getMessageBody() {
        return messageBody;
    }

    public void setMessageBody(String messageBody) {
        this.messageBody = messageBody;
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
}
