package com.sg.cardealership.model;

public class Users
{
    private int userId;
    private String username;
    private String password;
    private Boolean admin;


    public Users()
    {
        this.userId = 0;
        this.username = "";
        this.password = "";
        this.admin = null;
    }

    public Users(int userId, String username, String password, boolean admin)
    {
        this.userId = userId;
        this.username = username;
        this.password = password;
        this.admin = admin;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }
}
