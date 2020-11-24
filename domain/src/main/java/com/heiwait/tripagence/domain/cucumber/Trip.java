package com.heiwait.tripagence.domain.cucumber;

public class Trip {

    private final String destination;

    private final TravelClass travelClass;

    private final Integer ticketPrice;

    private final Integer stayFees;

    private final Integer agencyFees;

    public Trip(final String destination, final TravelClass travelClass, final Integer ticketPrice,
                final Integer stayFees, final Integer agencyFees) {
        this.destination = destination;
        this.travelClass = travelClass;
        this.ticketPrice = ticketPrice;
        this.stayFees = stayFees;
        this.agencyFees = agencyFees;
    }

    public Integer calculatedPrice() {
        return (this.ticketPrice * travelClass.coefficient()) + this.stayFees + this.agencyFees;
    }
}
