package com.epam.geometry.circle.service;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CircleServiceTest {
    @Test
    public void findCircleAreaTest() {
        double expected = Math.PI * 4;
        double radius = 2;
        CircleService service = new CircleService();
        double actual = service.findCircleArea(radius);
        assertEquals(actual, expected);
    }

    @Test
    public void findCircleLengthTest() {
        double expected = Math.PI * 6;
        double radius = 3;
        CircleService service = new CircleService();
        double actual = service.findCircleLength(radius);
        assertEquals(actual, expected);
    }
}