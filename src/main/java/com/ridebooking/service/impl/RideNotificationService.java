package com.ridebooking.service.impl;

import com.ridebooking.service.RideNotifier;

public class RideNotificationService implements RideNotifier {

    @Override
    public void notifyRideRequested(String riderName, String driverName) {
        System.out.println("Ride requested by " + riderName + " from driver " + driverName + ".");
    }

    @Override
    public void notifyRideStarted(String riderName, String driverName) {
        System.out.println("Ride started between " + riderName + " and " + driverName + ".");
    }

    @Override
    public void notifyRideEnded(String riderName, String driverName, double fareAmount) {
        System.out.println("✅ Ride completed between " + driverName + " and " + riderName + ". Fare: ₹" + fareAmount);
    }

    @Override
    public void notifyMissingRider(String riderName) {
        System.out.println("Rider '" + riderName + "' not found.");
    }

    @Override
    public void notifyMissingDriver(String driverName) {
        System.out.println("Driver '" + driverName + "' not found.");
    }

    @Override
    public void notifyInvalidRideParticipants() {
        System.out.println("Either rider or driver is invalid.");
    }
}
