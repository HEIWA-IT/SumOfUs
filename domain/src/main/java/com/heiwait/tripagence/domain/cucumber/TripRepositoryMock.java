package com.heiwait.tripagence.domain.cucumber;

import java.util.HashMap;
import java.util.Map;

public class TripRepositoryMock implements TripRepository {
    private static final Map<String, Trip> trips;

    static {
        trips = new HashMap<>();
        trips.put("Paris", new Trip(100, 800, 50));
        trips.put("New-York", new Trip(800, 1000, 100));
        trips.put("Lille", new Trip(0, 0, 0));
        trips.put("Beijing", new Trip(1000, 1000, 100));
        trips.put("Tokyo", new Trip(1200, 1000, 100));
    }

    @Override
    public Trip find(String destination) {
        return trips.get(destination);
    }
}
