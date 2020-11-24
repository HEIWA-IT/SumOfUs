package com.heiwait.tripagence.domain.cucumber;

public class Pricer {

    private TripRepository tripRepository;

    public Pricer(final TripRepository tripRepository) {
        this.tripRepository = tripRepository;
    }

    public Integer priceTrip(final String destination, final TravelClass travelClass) {
        Trip trip = tripRepository.find(destination);
        return (trip.ticketPrice() * travelClass.coefficient()) + trip.stayFees() + trip.agencyFees();
    }
}
