package com.epam.geometry.circle.service;

import com.epam.geometry.circle.entity.*;

public class Creator {
    public Circle createCircle(double radius, CircleService service) {
        return new Circle(radius, service.findCircleLength(radius), service.findCircleArea(radius));
    }
}
