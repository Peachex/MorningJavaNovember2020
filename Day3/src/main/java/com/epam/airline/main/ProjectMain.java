package com.epam.airline.main;

import com.epam.airline.entity.Airline;
import com.epam.airline.entity.Airport;
import com.epam.airline.report.AirlineReport;
import com.epam.airline.service.AirportService;

import java.time.LocalTime;
import java.time.DayOfWeek;
import java.util.Set;

public class ProjectMain {
    public static void main(String[] args) {
        Airport airport = new Airport();
        AirportService service = new AirportService();
        String destination = "Minsk";
        String planeType = "Cargo";
        LocalTime time = LocalTime.of(14, 34, 15);
        DayOfWeek dayOfWeek = DayOfWeek.MONDAY;
        boolean fromMinToMax = true;

        StringBuilder message1 = new StringBuilder();
        message1.append("Flights to ").append(destination);

        StringBuilder message2 = new StringBuilder();
        message2.append("Flights on ").append(dayOfWeek);

        StringBuilder message3 = new StringBuilder();
        message3.append("Flights on ").append(dayOfWeek).append(", after ").append(time);

        StringBuilder message4 = new StringBuilder();
        message4.append("Flights on ").append(planeType);

        StringBuilder message5 = new StringBuilder();
        message5.append("Flights, sorted by day of week");

        Set<Airline> result1 = service.findFlightByDestination(destination, airport);
        Set<Airline> result2 = service.findFlightByDayOfWeek(dayOfWeek, airport);
        Set<Airline> result3 = service.findFlightByDayOfWeekAndTime(dayOfWeek, time, airport);
        Set<Airline> result4 = service.findFlightByPlaneType(planeType, airport);
        Set<Airline> result5 = service.sortFlightByDayOfWeek(fromMinToMax, airport);

        AirlineReport reporter = new AirlineReport();
        reporter.reportAirline(result1, message1);
        reporter.reportAirline(result2, message2);
        reporter.reportAirline(result3, message3);
        reporter.reportAirline(result4, message4);
        reporter.reportAirline(result5, message5);
    }
}