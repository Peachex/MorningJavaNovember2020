package com.epam.geometry.circle.service;

import com.epam.geometry.circle.entity.Circle;

public class CircleService {
    public double findCircleArea(Circle circle) {
        double result = Math.PI * Math.pow(circle.getRadius(), 2);
        return result;
    }

    public double findCircleLength(Circle circle) {
        double result = 2 * Math.PI * circle.getRadius();
        return result;
    }
}
