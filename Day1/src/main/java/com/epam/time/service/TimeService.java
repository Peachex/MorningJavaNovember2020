package com.epam.time.service;

import com.epam.time.entity.Time;

public class TimeService {
    public Time convertSeconds(int seconds) {
        int hour = seconds / 3600;
        int minute = seconds % 3600 / 60;
        int second = seconds % 3600 % 60;
        return new Time(hour, minute, second);
    }
}
