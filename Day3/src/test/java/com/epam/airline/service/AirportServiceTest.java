package com.epam.airline.service;

import com.epam.airline.entity.*;

import static org.testng.Assert.assertEquals;

import java.math.*;
import java.time.LocalTime;
import java.time.DayOfWeek;
import java.util.*;

import org.testng.annotations.Test;

public class AirportServiceTest {
    @Test
    public void findFlightByDestinationTest() {
        Set<Airline> expected = new LinkedHashSet<Airline>();

        expected.add(new Airline("Minsk", "4", "Jumbo Passenger Jet",
                LocalTime.of(10, 11, 23), DayOfWeek.SUNDAY, new BigDecimal("19.99")));

        expected.add(new Airline("Minsk", "3", "Passenger Turbo Props",
                LocalTime.of(19, 19, 19), DayOfWeek.FRIDAY, new BigDecimal("15.55")));

        Airport airport = new Airport();
        AirportService service = new AirportService();
        String destination = "Minsk";
        Set<Airline> actual = service.findFlightByDestination(destination, airport);
        assertEquals(actual, expected);
    }

    @Test
    public void findFlightByDayOfWeekTest() {
        Set<Airline> expected = new LinkedHashSet<Airline>();

        expected.add(new Airline("Denver", "1", "Light Passenger Jet",
                LocalTime.of(14, 32, 56), DayOfWeek.MONDAY, new BigDecimal("9.39")));

        expected.add(new Airline("Denver", "5", "Cargo",
                LocalTime.of(23, 59, 59), DayOfWeek.MONDAY, new BigDecimal("34.23")));

        Airport airport = new Airport();
        AirportService service = new AirportService();
        DayOfWeek dayOfWeek = DayOfWeek.MONDAY;
        Set<Airline> actual = service.findFlightByDayOfWeek(dayOfWeek, airport);
        assertEquals(actual, expected);
    }

    @Test
    public void findFlightByDayOfWeekAndTimeTest() {
        Set<Airline> expected = new LinkedHashSet<Airline>();

        expected.add(new Airline("Denver", "5", "Cargo",
                LocalTime.of(23, 59, 59), DayOfWeek.MONDAY, new BigDecimal("34.23")));

        Airport airport = new Airport();
        AirportService service = new AirportService();
        LocalTime time = LocalTime.of(14, 34, 15);
        DayOfWeek dayOfWeek = DayOfWeek.MONDAY;
        Set<Airline> actual = service.findFlightByDayOfWeekAndTime(dayOfWeek, time, airport);
        assertEquals(actual, expected);
    }

    @Test
    public void findFlightByPlaneTypeTest() {
        Set<Airline> expected = new LinkedHashSet<Airline>();

        expected.add(new Airline("Denver", "5", "Cargo",
                LocalTime.of(23, 59, 59), DayOfWeek.MONDAY, new BigDecimal("34.23")));

        Airport airport = new Airport();
        AirportService service = new AirportService();
        String planeType = "Cargo";
        Set<Airline> actual = service.findFlightByPlaneType(planeType, airport);
        assertEquals(actual, expected);
    }

    @Test
    public void sortFlightByDayOfWeek() {
        List<Airline> expected = new ArrayList<Airline>();

        expected.add(new Airline("Denver", "1", "Light Passenger Jet",
                LocalTime.of(14, 32, 56), DayOfWeek.MONDAY, new BigDecimal("9.39")));

        expected.add(new Airline("Denver", "5", "Cargo",
                LocalTime.of(23, 59, 59), DayOfWeek.MONDAY, new BigDecimal("34.23")));

        expected.add(new Airline("Beijing", "2", "Mid Size Passenger Jet",
                LocalTime.of(5, 25, 1), DayOfWeek.FRIDAY, new BigDecimal("10.00")));

        expected.add(new Airline("Minsk", "3", "Passenger Turbo Props",
                LocalTime.of(19, 19, 19), DayOfWeek.FRIDAY, new BigDecimal("15.55")));

        expected.add(new Airline("Minsk", "4", "Jumbo Passenger Jet",
                LocalTime.of(10, 11, 23), DayOfWeek.SUNDAY, new BigDecimal("19.99")));

        Airport airport = new Airport();
        AirportService service = new AirportService();
        boolean fromMinToMax = true;
        Set<Airline> actual = service.sortFlightByDayOfWeek(fromMinToMax, airport);
        assertEquals(actual, expected);
    }
}