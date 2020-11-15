package com.epam.geometry.circle.report;

import com.epam.geometry.circle.entity.Circle;

public class CircleReport {
    public void reportCircle(Circle circle) {
        System.out.println("R = " + circle.getRadius() + "\nL = " + circle.getCircleLength() + "\nS = " + circle.getArea());
    }
}
