package com.epam.point.main;

import com.epam.point.entity.*;
import com.epam.point.report.*;
import com.epam.point.service.*;

public class ProjectMain {
    public static void main(String[] args) {
        Point point1 = new Point(1, 2);
        Point point2 = new Point(3, 4);
        PointService service = new PointService();
        Point result = service.findClosesPoint(point1, point2);
        PointReport reporter = new PointReport();
        reporter.reportPoint(point1, point2, result);
    }
}
