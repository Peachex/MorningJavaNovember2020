package com.epam.time.main;

import com.epam.time.entity.Time;
import com.epam.time.report.TimeReport;
import com.epam.time.service.TimeService;

public class ProjectMain {
    public static void main(String[] args) {
        TimeService service = new TimeService();
        int secondsAmount = 9876;
        Time time = service.convertSeconds(secondsAmount);
        TimeReport reporter = new TimeReport();
        reporter.reportTime(time);
    }
}
