package com.heiwait.tripagence.domain.cucumber;

public class Trip {

    private final Integer ticketPrice;

    private final Integer stayFees;

    private final Integer agencyFees;

    public Trip(final Integer ticketPrice, final Integer stayFees, final Integer agencyFees) {
        this.ticketPrice = ticketPrice;
        this.stayFees = stayFees;
        this.agencyFees = agencyFees;
    }

    public Integer agencyFees() {
        return this.agencyFees;
    }

    public Integer ticketPrice() {
        return this.ticketPrice;
    }

    public Integer stayFees() {
        return this.stayFees;
    }
}
