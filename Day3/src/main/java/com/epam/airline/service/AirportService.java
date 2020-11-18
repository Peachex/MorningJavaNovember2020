package com.epam.airline.service;

import com.epam.airline.entity.*;

import java.time.LocalTime;
import java.time.DayOfWeek;
import java.util.*;

public class AirportService {
    public Set<Airline> findFlightByDestination(String destination, Airport airport) {
        Set<Airline> airlinesArray = airport.getAirlines();
        Set<Airline> result = new LinkedHashSet<Airline>();
        for (Airline airline : airlinesArray) {
            if (airline.getDestination().equalsIgnoreCase(destination)) {
                result.add(airline);
            }
        }
        return result;
    }

    public Set<Airline> findFlightByDayOfWeek(DayOfWeek dayOfWeek, Airport airport) {
        Set<Airline> airlinesArray = airport.getAirlines();
        Set<Airline> result = new LinkedHashSet<Airline>();
        for (Airline airline : airlinesArray) {
            if (airline.getDayOfWeek().equals(dayOfWeek)) {
                result.add(airline);
            }
        }
        return result;
    }

    public Set<Airline> findFlightByDayOfWeekAndTime(DayOfWeek dayOfWeek, LocalTime time, Airport airport) {
        Set<Airline> airlinesArray = airport.getAirlines();
        Set<Airline> result = new LinkedHashSet<Airline>();
        for (Airline airline : airlinesArray) {
            if (airline.getDayOfWeek().equals(dayOfWeek) && airline.getDepartureTime().isAfter(time)) {
                result.add(airline);
            }
        }
        return result;
    }

    public Set<Airline> findFlightByPlaneType(String planeType, Airport airport) {
        Set<Airline> airlinesArray = airport.getAirlines();
        Set<Airline> result = new LinkedHashSet<Airline>();
        for (Airline airline : airlinesArray) {
            if (airline.getPlaneType().equals(planeType)) {
                result.add(airline);
            }
        }
        return result;
    }

    public Set<Airline> sortFlightByDayOfWeek(boolean fromMinToMax, Airport airport) {
        List<Airline> sortedList = new ArrayList<Airline>(airport.getAirlines());
        sortedList.sort(new Comparator<Airline>() {
            @Override
            public int compare(Airline airline1, Airline airline2) {
                int result = Integer.compare(airline1.getDayOfWeek().getValue(), airline2.getDayOfWeek().getValue());
                return (fromMinToMax ? 1 : -1) * result;
            }
        });
        return new LinkedHashSet<Airline>(sortedList);
    }
}
