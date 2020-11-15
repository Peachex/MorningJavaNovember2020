package com.epam.airline.main;

import com.epam.airline.entity.*;
import com.epam.airline.report.AirlineReport;
import com.epam.airline.service.AirportService;

import java.time.LocalTime;
import java.time.DayOfWeek;
import java.util.List;

public class ProjectMain {
    public static void main(String[] args) {
        Airport airport = new Airport();
        AirportService service = new AirportService();
        String destination = "Minsk";
        String planeType = "Cargo";
        LocalTime time = LocalTime.of(14, 34, 15);
        DayOfWeek dayOfWeek = DayOfWeek.MONDAY;
        boolean fromMinToMax = true;

        List<Airline> result1 = service.findFlightByDestination(destination, airport);
        List<Airline> result2 = service.findFlightByDayOfWeek(dayOfWeek, airport);
        List<Airline> result3 = service.findFlightByDayOfWeekAndTime(dayOfWeek, time, airport);
        List<Airline> result4 = service.findFlightByPlaneType(planeType, airport);
        List<Airline> result5 = service.sortFlightByDayOfWeek(fromMinToMax, airport);

        AirlineReport reporter = new AirlineReport();
        reporter.reportAirline(result1);
        reporter.reportAirline(result2);
        reporter.reportAirline(result3);
        reporter.reportAirline(result4);
        reporter.reportAirline(result5);
    }
}