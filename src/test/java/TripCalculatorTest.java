import com.edataconsulting.refactoring.TripCalculator;
import com.edataconsulting.refactoring.TripSegment;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TripCalculatorTest {

    @Test
    void calculateTripHoursForBaseCaseShouldReturnTheRightValue() {
        TripSegment tripSegment1 = new TripSegment();
        tripSegment1.setDistanceKm(120);
        tripSegment1.setSpeedKmh(60);
        tripSegment1.setNightTime(true);

        TripSegment tripSegment2 = new TripSegment();
        tripSegment2.setDistanceKm(80);
        tripSegment2.setSpeedKmh(40);
        tripSegment2.setNightTime(true);

        List<TripSegment> tripSegments =  List.of(tripSegment1, tripSegment2);

        List<Double> stopHours = List.of(10.0);

        assertEquals(15, TripCalculator.calculateTripHours(tripSegments, stopHours));
    }

    @Test
    void calculateTripHoursForACombinationOfNightAndDaySegmentShouldReturnTheRightValue() {
        TripSegment tripSegment1 = new TripSegment();
        tripSegment1.setDistanceKm(100);
        tripSegment1.setSpeedKmh(100);
        tripSegment1.setNightTime(true);

        TripSegment tripSegment2 = new TripSegment();
        tripSegment2.setDistanceKm(200);
        tripSegment2.setSpeedKmh(40);
        tripSegment2.setNightTime(false);

        List<TripSegment> tripSegments =  List.of(tripSegment1, tripSegment2);

        List<Double> stopHours = List.of(3.0, 0.5);

        assertEquals(9.75, TripCalculator.calculateTripHours(tripSegments, stopHours));
    }

    @Test
    void calculateTripHoursForEmptySegmentsAndEmptyStopsShouldReturnZero() {
        List<TripSegment> tripSegments =  new ArrayList<>();
        List<Double> stopHours = List.of();

        assertEquals(0.0, TripCalculator.calculateTripHours(tripSegments, stopHours));
    }

    @Test
    void calculateTripHoursForEmptySegmentsButWithStopsShouldReturnStopsTime() {
        List<TripSegment> tripSegments =  new ArrayList<>();

        List<Double> stopHours = List.of(2.0);

        assertEquals(2.0, TripCalculator.calculateTripHours(tripSegments, stopHours));
    }

    @Test
    void calculateTripHoursWithoutStopsShouldReturnTheRightValue() {
        TripSegment tripSegment1 = new TripSegment();
        tripSegment1.setDistanceKm(100);
        tripSegment1.setSpeedKmh(100);
        tripSegment1.setNightTime(true);

        TripSegment tripSegment2 = new TripSegment();
        tripSegment2.setDistanceKm(200);
        tripSegment2.setSpeedKmh(40);
        tripSegment2.setNightTime(false);

        List<TripSegment> tripSegments =  List.of(tripSegment1, tripSegment2);

        List<Double> stopHours = List.of();

        assertEquals(6.25, TripCalculator.calculateTripHours(tripSegments, stopHours));
    }
}
