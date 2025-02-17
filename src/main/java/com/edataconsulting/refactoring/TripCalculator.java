package com.edataconsulting.refactoring;

import java.util.List;

public class TripCalculator {

    public static double calculateTripHours(List<TripSegment> tripSegments, List<Double> stopHours) {
        return calculateSegmentsHours(tripSegments) + calculateStopsHours(stopHours);
    }

    private static double calculateSegmentsHours(List<TripSegment> tripSegments) {
        return tripSegments.stream()
                .mapToDouble(TripSegment::tripSegmentHourCalculator)
                .sum();
    }

    private static double calculateStopsHours(List<Double> stopHours) {
        return stopHours.stream()
                .mapToDouble(Double::doubleValue)
                .sum();
    }
}
