package com.epam.time.report;

import com.epam.time.entity.Time;

public class TimeReport {
    public void reportTime(Time time) {
        System.out.println("hours/minutes/seconds\n" + time.getHour() + ":" + time.getMinute() + ":" + time.getSecond());
    }
}
