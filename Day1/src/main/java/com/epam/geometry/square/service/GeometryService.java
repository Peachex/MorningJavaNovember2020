package com.epam.geometry.square.service;

import com.epam.geometry.square.entity.Circle;
import com.epam.geometry.square.entity.Square;

public class GeometryService {
    public double findArea(double sideLength) {
        return Math.pow(sideLength, 2);
    }

    public double findSquareLengthByArea(double area) {
        return Math.sqrt(area);
    }

    public double findRadiusBySquareLength(Square square) {
        return (square.getSideLength() / 2);
    }

    public double findAreaRatio(Square square1, Square square2) {
        return (square1.getArea() / square2.getArea());
    }

    public double findSquareLengthByRadius(Circle circle) {
        double result = circle.getRadius() * 2 / Math.sqrt(2);
        return result;
    }
}