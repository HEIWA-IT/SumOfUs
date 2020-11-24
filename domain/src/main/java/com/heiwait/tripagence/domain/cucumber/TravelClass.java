package com.heiwait.tripagence.domain.cucumber;

public enum TravelClass {
    ECONOMIC(1),
    FIRST(2),
    BUSINESS(5);

    private Integer coefficient;

    TravelClass(Integer coefficient) {
        this.coefficient = coefficient;
    }

    public Integer coefficient() {
        return this.coefficient;
    }
}
