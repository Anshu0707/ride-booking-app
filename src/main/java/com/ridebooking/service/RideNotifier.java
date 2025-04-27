package com.ridebooking.service;

public interface RideNotifier {
    void notifyRideRequested(String riderName, String driverName);
    void notifyRideStarted(String riderName, String driverName);
    void notifyRideEnded(String riderName, String driverName, double fareAmount);
    void notifyMissingRider(String riderName);
    void notifyMissingDriver(String driverName);
    void notifyInvalidRideParticipants();
}
