package com.epam.geometry.square.service;

import com.epam.geometry.square.entity.*;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class GeometryServiceTest {
    @Test
    public void findAreaTest() {
        double sideLength = 2;
        Square square = new Square(sideLength);
        double expected = Math.pow(square.getSideLength(), 2);
        GeometryService service = new GeometryService();
        double actual = service.findArea(square);
        assertEquals(actual, expected);
    }

    @Test
    public void findSquareLengthByAreaTest() {
        double area = 4;
        double expected = Math.sqrt(area);
        GeometryService service = new GeometryService();
        double actual = service.findSquareLengthByArea(area);
        assertEquals(actual, expected);
    }

    @Test
    public void findSquareLengthByRadiusTest() {
        double radius = Math.sqrt(2);
        Circle circle = new Circle(radius);
        double expected = circle.getRadius() * 2 / Math.sqrt(2);
        GeometryService service = new GeometryService();
        double actual = service.findSquareLengthByRadius(circle);
        assertEquals(actual, expected);
    }

    @Test
    public void findRadiusBySquareLengthTest() {
        double sideLength = 4;
        Square square = new Square(sideLength);
        double expected = sideLength / 2;
        GeometryService service = new GeometryService();
        double actual = service.findRadiusBySquareLength(square);
        assertEquals(actual, expected);
    }

    @Test
    public void findAreaRatioTest() {
        double sideLength1 = 4;
        Square square1 = new Square(sideLength1);
        double sideLength2 = 2;
        Square square2 = new Square(sideLength2);
        double area1 = 16;
        double area2 = 4;
        double expected = area1 / area2;
        GeometryService service = new GeometryService();
        double actual = service.findAreaRatio(area1, area2);
        assertEquals(actual, expected);
    }
}