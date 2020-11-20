package com.epam.airline.report;

import com.epam.airline.entity.Airline;

import java.util.Set;

public class AirlineReport {
    public void reportAirline(Set<Airline> airlines, StringBuilder message) {
        System.out.println(message + ":\n");
        for (Airline airline : airlines) {
            System.out.println(airline);
        }
        System.out.println("------------------------------");
    }
}
