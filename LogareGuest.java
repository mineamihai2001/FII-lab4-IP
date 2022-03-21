package com.company;

public class LogareGuest extends MeniuLogare{
    private String username;
    private String password;

    public String getUsername() {
        return this.username;
    }
    public String getPassword() {
        return this.password;
    }
    public void setRandomUsername() {
        this.username = String.valueOf(Math.random());
        this.password = "";
    }
}
