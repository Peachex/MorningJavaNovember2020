package com.epam.geometry.circle.main;

import com.epam.geometry.circle.entity.*;
import com.epam.geometry.circle.report.*;
import com.epam.geometry.circle.service.*;

public class ProjectMain {
    public static void main(String[] args) {
        double radius = 3;
        Circle circle = new Circle(radius);
        CircleService service = new CircleService();
        double circleLength = service.findCircleLength(circle);
        double circleArea = service.findCircleArea(circle);
        CircleReport report = new CircleReport();
        report.reportCircle(circle, circleLength, circleArea);
    }
}
