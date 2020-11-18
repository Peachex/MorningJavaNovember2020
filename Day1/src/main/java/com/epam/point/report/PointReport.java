package com.epam.point.report;

import com.epam.point.entity.*;

public class PointReport {
    public void reportPoint(Point point1, Point point2, Point result) {
        System.out.println("Point1: x = " + point1.getX() + ", y = " + point1.getY() + "\nPoint2: x = " +
                point2.getX() + ", y = " + point2.getY() + "\nCloses point:" + " x = " + result.getX() + ", y = " +
                result.getY());
    }
}
