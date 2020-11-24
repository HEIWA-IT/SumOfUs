package com.heiwait.tripagence.domain.cucumber;

public class Trip {

    private String destination;

    private String travelClass;

    private Integer ticketPrice;

    private Integer stayFees;

    private Integer agencyFees;

    public Trip(String destination, String travelClass, Integer ticketPrice, Integer stayFees, Integer agencyFees) {
        this.destination = destination;
        this.travelClass = travelClass;
        this.ticketPrice = ticketPrice;
        this.stayFees = stayFees;
        this.agencyFees = agencyFees;
    }

    public Integer calculatedPrice() {
        if (destination.equals("Lille")) {
            return 0;
        } else if (destination.equals("New-York")) {
            return 2700;
        }
        return 1050;
    }
}
