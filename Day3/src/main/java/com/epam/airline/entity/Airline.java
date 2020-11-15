package com.epam.airline.entity;

import java.time.LocalTime;
import java.time.DayOfWeek;

public class Airline {
    private String destination;
    private String flightNumber;
    private String planeType;
    private LocalTime departureTime;
    private DayOfWeek dayOfWeek;

    public Airline(String destination, String flightNumber, String planeType, LocalTime departureTime,
                   DayOfWeek dayOfWeek) {
        this.destination = destination;
        this.flightNumber = flightNumber;
        this.planeType = planeType;
        this.departureTime = departureTime;
        this.dayOfWeek = dayOfWeek;
    }

    public String getDestination() {
        return this.destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getFlightNumber() {
        return this.flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getPlaneType() {
        return this.planeType;
    }

    public void setPlaneType(String planeType) {
        this.planeType = planeType;
    }

    public LocalTime getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(LocalTime departureTime) {
        this.departureTime = departureTime;
    }

    public DayOfWeek getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(DayOfWeek dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("\ndestination = ").append(destination);
        sb.append("\nflightNumber = ").append(flightNumber);
        sb.append("\nplaneType = ").append(planeType);
        sb.append("\ndepartureTime = ").append(departureTime);
        sb.append("\ndayOfWeek = ").append(dayOfWeek);
        sb.append("\n");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Airline)) {
            return false;
        }
        Airline airline = (Airline) o;
        return destination.equals(airline.destination) &&
                flightNumber.equals(airline.flightNumber) &&
                planeType.equals(airline.planeType) &&
                departureTime.equals(airline.departureTime) &&
                dayOfWeek == airline.dayOfWeek;
    }
}
