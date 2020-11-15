package com.epam.airline.service;

import com.epam.airline.entity.*;

import java.time.LocalTime;
import java.time.DayOfWeek;
import java.util.List;
import java.util.ArrayList;
import java.util.Comparator;

public class AirportService {
    public List<Airline> findFlightByDestination(String destination, Airport airport) {
        List<Airline> airlinesArray = airport.getAirlinesArray();
        List<Airline> result = new ArrayList<Airline>();
        for (Airline airline : airlinesArray) {
            if (airline.getDestination().equalsIgnoreCase(destination)) {
                result.add(airline);
            }
        }
        return result;
    }

    public List<Airline> findFlightByDayOfWeek(DayOfWeek dayOfWeek, Airport airport) {
        List<Airline> airlinesArray = airport.getAirlinesArray();
        List<Airline> result = new ArrayList<Airline>();
        for (Airline airline : airlinesArray) {
            if (airline.getDayOfWeek().equals(dayOfWeek)) {
                result.add(airline);
            }
        }
        return result;
    }

    public List<Airline> findFlightByDayOfWeekAndTime(DayOfWeek dayOfWeek, LocalTime time, Airport airport) {
        List<Airline> airlinesArray = airport.getAirlinesArray();
        List<Airline> result = new ArrayList<Airline>();
        for (Airline airline : airlinesArray) {
            if (airline.getDayOfWeek().equals(dayOfWeek) && airline.getDepartureTime().isAfter(time)) {
                result.add(airline);
            }
        }
        return result;
    }

    public List<Airline> findFlightByPlaneType(String planeType, Airport airport) {
        List<Airline> airlinesArray = airport.getAirlinesArray();
        List<Airline> result = new ArrayList<Airline>();
        for (Airline airline : airlinesArray) {
            if (airline.getPlaneType().equals(planeType)) {
                result.add(airline);
            }
        }
        return result;
    }

    public List<Airline> sortFlightByDayOfWeek(boolean fromMinToMax, Airport airport) {
        List<Airline> result = airport.getAirlinesArray();
        result.sort(new Comparator<Airline>() {
            @Override
            public int compare(Airline o1, Airline o2) {
                int result = Integer.compare(o1.getDayOfWeek().getValue(), o2.getDayOfWeek().getValue());
                return (fromMinToMax ? 1 : -1) * result;
            }
        });
        return result;
    }
}
