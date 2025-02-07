package com.edataconsulting.refactoring;

import java.util.List;

public class TripCalculator {

    public static double calculateTripHours(List<TripSegment> tripSegments, List<Double> stops) {
        double totalHours = tripSegments.stream()
                .mapToDouble(TripSegment::tripSegmentHourCalculator)
                .sum();

        double totalStopHours = stops.stream()
                .mapToDouble(Double::doubleValue)
                .sum();

        return totalHours + totalStopHours;
    }
}
