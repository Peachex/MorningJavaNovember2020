package com.epam.geometry.square.service;

import com.epam.geometry.square.entity.*;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class GeometryServiceTest {
    GeometryService service = new GeometryService();

    @Test
    public void findAreaTest() {
        double expected = 4;
        double sideLength = 2;
        double actual = service.findArea(sideLength);
        assertEquals(actual, expected);
    }

    @Test
    public void findSquareLengthByAreaTest() {
        double expected = 2;
        double area = 4;
        double actual = service.findSquareLengthByArea(area);
        assertEquals(actual, expected);
    }

    @Test
    public void findSquareLengthByRadiusTest() {
        double expected = 2;
        Circle circle = new Circle(Math.sqrt(2));
        double actual = service.findSquareLengthByRadius(circle);
        assertEquals(actual, expected);
    }

    @Test
    public void findRadiusBySquareLengthTest() {
        double expected = 2;
        Square square = new Square(4, 16);
        double actual = service.findRadiusBySquareLength(square);
        assertEquals(actual, expected);
    }

    @Test
    public void findAreaRatioTest() {
        double expected = 4;
        Square square1 = new Square(4, 16);
        Square square2 = new Square(2, 4);
        double actual = service.findAreaRatio(square1, square2);
        assertEquals(actual, expected);
    }
}