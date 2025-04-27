package com.ridebooking.model;

import com.ridebooking.enums.UserType;

public abstract class User {
    protected String name;
    protected String phoneNumber;
    protected UserType userType;

    public User(String name, String phoneNumber, UserType userType) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.userType = userType;
    }

    public String getName() {
        return name;
    }

    public UserType getUserType() {
        return userType;
    }
}
