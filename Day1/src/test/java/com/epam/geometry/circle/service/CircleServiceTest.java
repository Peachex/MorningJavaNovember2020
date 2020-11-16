package com.epam.geometry.circle.service;

import com.epam.geometry.circle.entity.*;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class CircleServiceTest {
    @Test
    public void findCircleAreaTest() {
        double radius = 2;
        Circle circle = new Circle(radius);
        double expected = Math.PI * Math.pow(circle.getRadius(), 2);
        CircleService service = new CircleService();
        double actual = service.findCircleArea(circle);
        assertEquals(actual, expected);
    }

    @Test
    public void findCircleLengthTest() {
        double radius = 3;
        Circle circle = new Circle(radius);
        double expected = Math.PI * circle.getRadius() * 2;
        CircleService service = new CircleService();
        double actual = service.findCircleLength(circle);
        assertEquals(actual, expected);
    }
}