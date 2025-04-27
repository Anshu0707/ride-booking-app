package com.ridebooking.model;

import com.ridebooking.enums.RideStatus;

public class Ride {
    private Rider rider;
    private Driver driver;
    private double fare;
    private RideStatus status;

    public Ride(Rider rider, Driver driver, double fare) {
        this.rider = rider;
        this.driver = driver;
        this.fare = fare;
        this.status = RideStatus.REQUESTED;
    }

    public Rider getRider() {
        return rider;
    }

    public Driver getDriver() {
        return driver;
    }

    public double getFare() {
        return fare;
    }

    public RideStatus getStatus() {
        return status;
    }

    public void setStatus(RideStatus status) {
        this.status = status;
    }
}
