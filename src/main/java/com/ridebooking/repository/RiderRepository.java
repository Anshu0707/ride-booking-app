package com.ridebooking.repository;

import com.ridebooking.model.Rider;
import java.util.HashMap;
import java.util.Map;

public class RiderRepository {
    private final Map<String, Rider> riders = new HashMap<>();

    public void addRider(Rider rider) {
        riders.put(rider.getName(), rider);
    }

    public Rider getRiderByName(String name) {
        return riders.get(name);
    }
}
