package com.epam.airline.entity;

import java.time.DayOfWeek;
import java.time.LocalTime;
import java.util.List;
import java.util.ArrayList;

public class Airport {
    private List<Airline> airlinesArray;

    public Airport() {
        airlinesArray = new ArrayList<Airline>();

        airlinesArray.add(new Airline("Minsk", "4", "Jumbo Passenger Jet",
                LocalTime.of(10, 11, 23), DayOfWeek.SUNDAY));

        airlinesArray.add(new Airline("Beijing", "2", "Mid Size Passenger Jet",
                LocalTime.of(5, 25, 1), DayOfWeek.FRIDAY));

        airlinesArray.add(new Airline("Denver", "1", "Light Passenger Jet",
                LocalTime.of(14, 32, 56), DayOfWeek.MONDAY));

        airlinesArray.add(new Airline("Minsk", "3", "Passenger Turbo Props",
                LocalTime.of(19, 19, 19), DayOfWeek.FRIDAY));

        airlinesArray.add(new Airline("Denver", "5", "Cargo",
                LocalTime.of(23, 59, 59), DayOfWeek.MONDAY));
    }

    public List<Airline> getAirlinesArray() {
        return this.airlinesArray;
    }

    public void addToAirlinesArray(Airline airline) {
        this.airlinesArray.add(airline);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Airport{");
        sb.append("airlinesArray=").append(airlinesArray);
        sb.append('}');
        return sb.toString();
    }
}
