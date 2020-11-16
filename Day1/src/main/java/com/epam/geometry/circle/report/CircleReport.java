package com.epam.geometry.circle.report;

import com.epam.geometry.circle.entity.Circle;

public class CircleReport {
    public void reportCircle(Circle circle, double circleLength, double circleArea) {
        System.out.println("R = " + circle.getRadius() + "\nL = " + circleLength + "\nS = " + circleArea);
    }
}
