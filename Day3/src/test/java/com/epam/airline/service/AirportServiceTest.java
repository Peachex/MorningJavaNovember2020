package com.epam.airline.service;

import com.epam.airline.entity.*;

import static org.testng.Assert.assertEquals;

import java.time.LocalTime;
import java.time.DayOfWeek;
import java.util.List;
import java.util.ArrayList;

import org.testng.annotations.Test;

public class AirportServiceTest {
    @Test
    public void findFlightByDestinationTest() {
        List<Airline> expected = new ArrayList<Airline>();

        expected.add(new Airline("Minsk", "4", "Jumbo Passenger Jet",
                LocalTime.of(10, 11, 23), DayOfWeek.SUNDAY));

        expected.add(new Airline("Minsk", "3", "Passenger Turbo Props",
                LocalTime.of(19, 19, 19), DayOfWeek.FRIDAY));

        Airport airport = new Airport();
        AirportService service = new AirportService();
        String destination = "Minsk";
        List<Airline> actual = service.findFlightByDestination(destination, airport);
        assertEquals(actual, expected);
    }

    @Test
    public void findFlightByDayOfWeekTest() {
        List<Airline> expected = new ArrayList<Airline>();

        expected.add(new Airline("Denver", "1", "Light Passenger Jet",
                LocalTime.of(14, 32, 56), DayOfWeek.MONDAY));

        expected.add(new Airline("Denver", "5", "Cargo",
                LocalTime.of(23, 59, 59), DayOfWeek.MONDAY));

        Airport airport = new Airport();
        AirportService service = new AirportService();
        DayOfWeek dayOfWeek = DayOfWeek.MONDAY;
        List<Airline> actual = service.findFlightByDayOfWeek(dayOfWeek, airport);
        assertEquals(actual, expected);
    }

    @Test
    public void findFlightByDayOfWeekAndTimeTest() {
        List<Airline> expected = new ArrayList<Airline>();

        expected.add(new Airline("Denver", "5", "Cargo",
                LocalTime.of(23, 59, 59), DayOfWeek.MONDAY));

        Airport airport = new Airport();
        AirportService service = new AirportService();
        LocalTime time = LocalTime.of(14, 34, 15);
        DayOfWeek dayOfWeek = DayOfWeek.MONDAY;
        List<Airline> actual = service.findFlightByDayOfWeekAndTime(dayOfWeek, time, airport);
        assertEquals(actual, expected);
    }

    @Test
    public void findFlightByPlaneTypeTest() {
        List<Airline> expected = new ArrayList<Airline>();

        expected.add(new Airline("Denver", "5", "Cargo",
                LocalTime.of(23, 59, 59), DayOfWeek.MONDAY));

        Airport airport = new Airport();
        AirportService service = new AirportService();
        String planeType = "Cargo";
        List<Airline> actual = service.findFlightByPlaneType(planeType, airport);
        assertEquals(actual, expected);
    }

    @Test
    public void sortFlightByDayOfWeek() {
        List<Airline> expected = new ArrayList<Airline>();

        expected.add(new Airline("Denver", "1", "Light Passenger Jet",
                LocalTime.of(14, 32, 56), DayOfWeek.MONDAY));

        expected.add(new Airline("Denver", "5", "Cargo",
                LocalTime.of(23, 59, 59), DayOfWeek.MONDAY));

        expected.add(new Airline("Beijing", "2", "Mid Size Passenger Jet",
                LocalTime.of(5, 25, 1), DayOfWeek.FRIDAY));

        expected.add(new Airline("Minsk", "3", "Passenger Turbo Props",
                LocalTime.of(19, 19, 19), DayOfWeek.FRIDAY));

        expected.add(new Airline("Minsk", "4", "Jumbo Passenger Jet",
                LocalTime.of(10, 11, 23), DayOfWeek.SUNDAY));

        Airport airport = new Airport();
        AirportService service = new AirportService();
        boolean fromMinToMax = true;
        List<Airline> actual = service.sortFlightByDayOfWeek(true, airport);
        assertEquals(actual, expected);
    }
}