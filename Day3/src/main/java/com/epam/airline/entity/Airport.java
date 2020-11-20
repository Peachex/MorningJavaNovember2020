package com.epam.airline.entity;

import java.math.BigDecimal;
import java.time.DayOfWeek;
import java.time.LocalTime;
import java.util.Set;
import java.util.LinkedHashSet;

public class Airport {
    private Set<Airline> airlines;

    public Airport() {
        airlines = new LinkedHashSet<Airline>();

        airlines.add(new Airline("Minsk", "4", "Jumbo Passenger Jet",
                LocalTime.of(10, 11, 23), DayOfWeek.SUNDAY, new BigDecimal("19.99")));

        airlines.add(new Airline("Beijing", "2", "Mid Size Passenger Jet",
                LocalTime.of(5, 25, 1), DayOfWeek.FRIDAY, new BigDecimal("10.00")));

        airlines.add(new Airline("Denver", "1", "Light Passenger Jet",
                LocalTime.of(14, 32, 56), DayOfWeek.MONDAY, new BigDecimal("9.39")));

        airlines.add(new Airline("Minsk", "3", "Passenger Turbo Props",
                LocalTime.of(19, 19, 19), DayOfWeek.FRIDAY, new BigDecimal("15.55")));

        airlines.add(new Airline("Denver", "5", "Cargo",
                LocalTime.of(23, 59, 59), DayOfWeek.MONDAY, new BigDecimal("34.23")));
    }

    public Set<Airline> getAirlines() {
        return this.airlines;
    }

    public void addToAirlines(Airline airline) {
        this.airlines.add(airline);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Airport{");
        sb.append("airlines=").append(airlines);
        sb.append('}');
        return sb.toString();
    }
}
