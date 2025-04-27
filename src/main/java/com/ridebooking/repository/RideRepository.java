package com.ridebooking.repository;

import com.ridebooking.model.Ride;
import java.util.*;

public class RideRepository {

    private final List<Ride> rides = new ArrayList<>();

    public void addRide(Ride ride) {
        rides.add(ride);
    }

    public List<Ride> getAllRides() {
        return Collections.unmodifiableList(rides); // prevent external modification by external classes.
    }
}
