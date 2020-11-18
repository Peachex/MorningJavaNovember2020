package com.epam.calendar.report;

import com.epam.calendar.entity.Calendar;

public class CalendarReport {
    public void reportCalendar(Calendar calendar, int daysAmount, boolean hasExtraDay) {
        System.out.println(calendar.getDate() + " - " + daysAmount + " day(s).\n" + (hasExtraDay? "This year has got " +
                "extra day." : "This year hasn't got extra day."));
    }
}