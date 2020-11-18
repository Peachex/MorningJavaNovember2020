package com.epam.point.service;

import com.epam.point.entity.*;

public class PointService {
    public Point findClosesPoint(Point point1, Point point2) {
        double distance1 = Math.hypot(point1.getX(), point1.getY());
        double distance2 = Math.hypot(point2.getX(), point2.getY());
        return distance1 < distance2 ? point1 : point2;
    }
}
