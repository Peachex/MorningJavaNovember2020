package com.epam.geometry.circle.main;

import com.epam.geometry.circle.entity.*;
import com.epam.geometry.circle.report.*;
import com.epam.geometry.circle.service.*;

public class ProjectMain {
    public static void main(String[] args) {
        CircleService service = new CircleService();
        Creator creator = new Creator();
        double radius = 3;
        Circle circle = creator.createCircle(radius, service);
        CircleReport report = new CircleReport();
        report.reportCircle(circle);
    }
}
