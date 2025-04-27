package com.ridebooking.service;

public interface RideService {
    void requestRide(String riderName, String driverName);
    void startRide(String riderName, String driverName);
    void endRide(String riderName, String driverName, double fareAmount);
}
