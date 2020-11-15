package com.epam.calendar.report;

import com.epam.calendar.entity.Calendar;

import java.time.LocalDate;

public class CalendarReport {
    public void reportCalendar(Calendar calendar, int daysAmount) {
        System.out.println(calendar.getDate() + " - " + daysAmount + " day(s).");
    }
}