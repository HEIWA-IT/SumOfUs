package com.heiwait.tripagency.infrastructure.repository.springdata;

import com.heiwait.tripagency.domain.Destination;
import com.heiwait.tripagency.domain.Trip;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Objects;

@Entity
@Table(name="trip")
public class TripEntity implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @Column(name="destination")
    private String destination;
    private Integer agencyFees;
    private Integer travelFees;

    public TripEntity(){}

    public TripEntity(String destination, Integer agencyFees, Integer travelFees) {
        this.destination = destination;
        this.agencyFees = agencyFees;
        this.travelFees = travelFees;
    }

    Trip toTrip(){
        return new Trip(new Destination(destination()), this.agencyFees(), travelFees());
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) return true;
        if (other == null || getClass() != other.getClass()) return false;
        TripEntity otherTrip = (TripEntity) other;
        return Objects.equals(destination, otherTrip.destination) &&
                Objects.equals(agencyFees, otherTrip.agencyFees) &&
                Objects.equals(travelFees, otherTrip.travelFees);
    }

    @Override
    public int hashCode() {
        return Objects.hash(destination, agencyFees, travelFees);
    }

    public String destination() {
        return destination;
    }

    public void setDestination(String destinationName) {
        this.destination = destinationName;
    }

    private Integer agencyFees() {
        return agencyFees;
    }

    public void setAgencyFees(Integer agencyFees) {
        this.agencyFees = agencyFees;
    }

    private Integer travelFees() {
        return travelFees;
    }

    public void setTravelFees(Integer travelFees) {
        this.travelFees = travelFees;
    }
}