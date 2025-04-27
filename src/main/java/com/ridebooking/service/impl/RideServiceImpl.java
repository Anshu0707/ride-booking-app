package com.ridebooking.service.impl;

import com.ridebooking.model.Driver;
import com.ridebooking.model.Ride;
import com.ridebooking.model.Rider;
import com.ridebooking.repository.DriverRepository;
import com.ridebooking.repository.RideRepository;
import com.ridebooking.repository.RiderRepository;
import com.ridebooking.service.RideNotifier;
import com.ridebooking.service.RideService;

public class RideServiceImpl implements RideService {

    private final DriverRepository driverRepository;
    private final RiderRepository riderRepository;
    private final RideRepository rideRepository;
    private final RideNotifier notificationService; 

    public RideServiceImpl(DriverRepository driverRepository,
                           RiderRepository riderRepository,
                           RideRepository rideRepository,
                           RideNotifier notificationService) { // Accept interface
        this.driverRepository = driverRepository;
        this.riderRepository = riderRepository;
        this.rideRepository = rideRepository;
        this.notificationService = notificationService;
    }

    @Override
    public void requestRide(String riderName, String driverName) {
        Rider rider = riderRepository.getRiderByName(riderName);
        Driver driver = driverRepository.getDriverByName(driverName);

        if (rider == null) {
            notificationService.notifyMissingRider(riderName);
            return;
        }

        if (driver == null) {
            notificationService.notifyMissingDriver(driverName);
            return;
        }

        notificationService.notifyRideRequested(riderName, driverName);
    }

    @Override
    public void startRide(String riderName, String driverName) {
        Rider rider = riderRepository.getRiderByName(riderName);
        Driver driver = driverRepository.getDriverByName(driverName);

        if (rider == null || driver == null) {
            notificationService.notifyInvalidRideParticipants();
            return;
        }

        notificationService.notifyRideStarted(riderName, driverName);
    }

    @Override
    public void endRide(String riderName, String driverName, double fareAmount) {
        Rider rider = riderRepository.getRiderByName(riderName);
        Driver driver = driverRepository.getDriverByName(driverName);

        if (rider == null || driver == null) {
            notificationService.notifyInvalidRideParticipants();
            return;
        }

        Ride ride = new Ride(rider, driver, fareAmount);
        rideRepository.addRide(ride);

        notificationService.notifyRideEnded(riderName, driverName, fareAmount);
    }
}
