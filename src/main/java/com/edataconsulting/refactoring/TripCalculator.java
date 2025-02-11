package com.edataconsulting.refactoring;

import java.util.List;

public class TripCalculator {

    public static double calculateTripHours(List<TripSegment> tripSegments, List<Double> stopHours) {
        double totalHours = tripSegments.stream()
                .mapToDouble(TripSegment::tripSegmentHourCalculator)
                .sum();

        double totalStopHours = stopHours.stream()
                .mapToDouble(Double::doubleValue)
                .sum();

        return totalHours + totalStopHours;
    }
}
