package com.ridebooking.model;

import com.ridebooking.enums.UserType;

public class Driver extends User {
    private boolean available;

    public Driver(String name, String phoneNumber) {
        super(name, phoneNumber, UserType.DRIVER);
        this.available = true;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}


