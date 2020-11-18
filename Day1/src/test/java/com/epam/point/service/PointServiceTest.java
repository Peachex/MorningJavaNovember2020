package com.epam.point.service;

import com.epam.point.entity.*;
import org.testng.annotations.Test;

import static org.testng.Assert.assertSame;

public class PointServiceTest {
    @Test
    public void findClosesPointTest() {
        Point expected = new Point(1, 2);
        Point point2 = new Point(3, 4);
        PointService service = new PointService();
        Point actual = service.findClosesPoint(expected, point2);
        assertSame(actual, expected);
    }
}
