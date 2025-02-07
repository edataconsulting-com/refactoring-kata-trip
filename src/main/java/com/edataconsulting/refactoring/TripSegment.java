package com.edataconsulting.refactoring;

import static com.edataconsulting.refactoring.Constants.NIGHT_SPEED_REDUCTION_FACTOR;

public class TripSegment {
    double distanceKm;
    double speedKmh;
    boolean isNightTime;

    public double getDistanceKm() {
        return distanceKm;
    }

    public TripSegment setDistanceKm(double distanceKm) {
        this.distanceKm = distanceKm;
        return this;
    }

    public double getSpeedKmh() {
        return speedKmh;
    }

    public TripSegment setSpeedKmh(double speedKmh) {
        this.speedKmh = speedKmh;
        return this;
    }

    public boolean isNightTime() {
        return isNightTime;
    }

    public TripSegment setNightTime(boolean nightTime) {
        isNightTime = nightTime;
        return this;
    }

    public Double tripSegmentHourCalculator() {
        return (!isNightTime) ? distanceKm / speedKmh
                : distanceKm / (speedKmh * NIGHT_SPEED_REDUCTION_FACTOR);
    }
}
