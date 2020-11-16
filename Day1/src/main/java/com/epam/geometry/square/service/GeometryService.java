package com.epam.geometry.square.service;

import com.epam.geometry.square.entity.Circle;
import com.epam.geometry.square.entity.Square;

public class GeometryService {
    public double findArea(Square square) {
        double result = Math.pow(square.getSideLength(), 2);
        return result;
    }

    public double findSquareLengthByArea(double area) {
        double result = Math.sqrt(area);
        return result;
    }

    public double findRadiusBySquareLength(Square square) {
        double result = square.getSideLength() / 2;
        return result;
    }

    public double findAreaRatio(double area1, double area2) {
        double result = area1 / area2;
        return result;
    }

    public double findSquareLengthByRadius(Circle circle) {
        double result = circle.getRadius() * 2 / Math.sqrt(2);
        return result;
    }
}