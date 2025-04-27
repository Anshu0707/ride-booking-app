package com.ridebooking.model;

import com.ridebooking.enums.UserType;

public class Rider extends User {
    public Rider(String name, String phoneNumber) {
        super(name, phoneNumber, UserType.RIDER);
    }
}
