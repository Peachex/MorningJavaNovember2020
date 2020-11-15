package com.epam.geometry.circle.service;

import com.epam.geometry.circle.entity.Circle;

public class CircleService {
    public double findCircleArea(double radius) {
        double result = Math.PI * Math.pow(radius, 2);
        return result;
    }

    public double findCircleLength(double radius) {
        double result = 2 * Math.PI * radius;
        return result;
    }
}
