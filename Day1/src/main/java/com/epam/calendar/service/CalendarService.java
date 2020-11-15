package com.epam.calendar.service;

import java.time.LocalDate;

public class CalendarService {
    public int findDaysAmount(LocalDate date) {
        return date.lengthOfMonth();
    }
}