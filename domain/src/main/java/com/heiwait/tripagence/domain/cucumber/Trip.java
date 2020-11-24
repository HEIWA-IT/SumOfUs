package com.heiwait.tripagence.domain.cucumber;

public class Trip {

    private String destination;

    private TravelClass travelClass;

    private Integer ticketPrice;

    private Integer stayFees;

    private Integer agencyFees;

    public Trip(String destination, TravelClass travelClass, Integer ticketPrice, Integer stayFees, Integer agencyFees) {
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
