package com.heiwait.tripagency.domain.cucumber.steps;

import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import static org.assertj.core.api.Assertions.assertThat;

public class CalculateTripFeesSteps {

    private String destination;

    private String travelClass;

    private Integer ticketPrice;

    private Integer stayFees;

    private Integer agencyFees;

    private Integer calculatedPrice;

    @Given("^the customer wants to travel to \"([^\"]*)\"$")
    public void the_customer_wants_to_travel_to(String dest) {
    // Write code here that turns the phrase above into concrete actions
        this.destination = dest;
    }

    @Given("^the customer wants to travel in \"([^\"]*)\" class$")
    public void the_customer_wants_to_travel_in_class(String travelClass) {
    // Write code here that turns the phrase above into concrete actions
        this.travelClass = travelClass;
    }

    @Given("^the economic travel ticket price is (\\d+)€$")
    public void the_economic_travel_ticket_price_is_€(Integer ticketPrice) {
    // Write code here that turns the phrase above into concrete actions
        this.ticketPrice = ticketPrice;
    }

    @Given("^the stay fees are (\\d+)€$")
    public void the_stay_fees_are_€(Integer stayFees) {
    // Write code here that turns the phrase above into concrete actions
        this.stayFees = stayFees;
    }

    @Given("^the agency fees are (\\d+)€$")
    public void the_agency_fees_are_€(Integer agencyFees) {
    // Write code here that turns the phrase above into concrete actions
        this.agencyFees = agencyFees;
    }

    @When("^the customer asked for the trip price")
    public void the_customer_asked_for_the_trip_price() {
    // Write code here that turns the phrase above into concrete actions
        this.calculatedPrice = 1050;
    }


    @Then("^the trip price is (\\d+)€$")
    public void the_trip_price_is_€(Integer expectedPrice) {
    // Write code here that turns the phrase above into concrete actions
        assertThat(expectedPrice).isEqualTo(this.calculatedPrice);
    }

    @Then("^the trip price returns the following message \"([^\"]*)\"$")
    public void the_trip_price_returns_the_following_message(String expectedMessage) {
    // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
}