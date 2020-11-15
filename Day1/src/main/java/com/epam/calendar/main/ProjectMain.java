package com.epam.calendar.main;

import com.epam.calendar.entity.Calendar;
import com.epam.calendar.report.CalendarReport;
import com.epam.calendar.service.CalendarService;

import java.time.LocalDate;

public class ProjectMain {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2021, 2, 2);
        Calendar calendar = new Calendar(date);
        CalendarService service = new CalendarService();
        int daysAmount = service.findDaysAmount(calendar.getDate());
        CalendarReport reporter = new CalendarReport();
        reporter.reportCalendar(calendar, daysAmount);
    }
}