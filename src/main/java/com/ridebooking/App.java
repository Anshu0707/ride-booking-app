package com.ridebooking;

import com.ridebooking.model.Driver;
import com.ridebooking.model.Rider;
import com.ridebooking.repository.DriverRepository;
import com.ridebooking.repository.RideRepository;
import com.ridebooking.repository.RiderRepository;
import com.ridebooking.service.RideNotifier;
import com.ridebooking.service.RideService;
import com.ridebooking.service.impl.RideNotificationService;
import com.ridebooking.service.impl.RideServiceImpl;

public class App {
    public static void main(String[] args) {

        // Step 1: Set up repositories (our in-memory data stores)
        DriverRepository driverRepository = new DriverRepository();
        RiderRepository riderRepository = new RiderRepository();
        RideRepository rideRepository = new RideRepository();

        // Step 2: Set up the notification service (implements RideNotifier)
        RideNotifier notificationService = new RideNotificationService();

        // Step 3: Set up the core RideService (depends on interfaces)
        RideService rideService = new RideServiceImpl(
                driverRepository,
                riderRepository,
                rideRepository,
                notificationService
        );

        // Step 4: Add a driver and rider
        Driver driver = new Driver("Aviral", "1234567890");
        Rider rider = new Rider("Anshuman", "0987654321");

        driverRepository.addDriver(driver);
        riderRepository.addRider(rider);

        // Step 5: Simulate ride flow
        rideService.requestRide("Anshuman", "Aviral");
        rideService.startRide("Anshuman", "Aviral");
        rideService.endRide("Anshuman", "Aviral", 250.0);
    }
}
