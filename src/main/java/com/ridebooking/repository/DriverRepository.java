package com.ridebooking.repository;

import com.ridebooking.model.Driver;
import java.util.HashMap;
import java.util.Map;

public class DriverRepository {
    private final Map<String, Driver> drivers = new HashMap<>();

    public void addDriver(Driver driver) {
        drivers.put(driver.getName(), driver);
    }

    public Driver getDriverByName(String name) {
        return drivers.get(name);
    }
}
