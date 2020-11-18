package com.epam.calendar.service;

import com.epam.calendar.entity.Calendar;
import org.testng.annotations.Test;

import java.time.LocalDate;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class CalendarServiceTest {
    @Test
    public void findDaysAmountTest() {
        Calendar calendar = new Calendar(LocalDate.of(2021, 2, 2));
        CalendarService service = new CalendarService();
        int expected = 28;
        int actual = service.findDaysAmount(calendar);
        assertEquals(actual, expected);
    }

    @Test
    public void checkYearForExtraDayTest() {
        Calendar calendar = new Calendar(LocalDate.of(2020, 2, 2));
        CalendarService service = new CalendarService();
        boolean condition = service.checkYearForExtraDay(calendar);
        assertTrue(condition);
    }
}
