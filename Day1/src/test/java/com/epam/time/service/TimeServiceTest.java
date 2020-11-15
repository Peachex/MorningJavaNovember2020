package com.epam.time.service;

import com.epam.time.entity.Time;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class TimeServiceTest {
    @Test
    public void convertSecondsTest() {
        TimeService service = new TimeService();
        Time expected = new Time(2, 44, 36);
        Time actual = service.convertSeconds(9876);
        assertEquals(actual.toString(), expected.toString());
    }
}
