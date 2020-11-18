package com.epam.calendar.service;

import com.epam.calendar.entity.*;

public class CalendarService {
    public int findDaysAmount(Calendar calendar) {
        return calendar.getDate().lengthOfMonth();
    }

    public boolean checkYearForExtraDay(Calendar calendar) {
        return calendar.getDate().isLeapYear();
    }
}