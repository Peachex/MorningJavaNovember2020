package com.epam.geometry.square.main;

import com.epam.geometry.square.entity.Circle;
import com.epam.geometry.square.entity.Square;
import com.epam.geometry.square.report.GeometricReport;
import com.epam.geometry.square.service.Creator;
import com.epam.geometry.square.service.GeometryService;

public class ProjectMain {
    public static void main(String[] args) {
        Creator creator = new Creator();
        GeometryService service = new GeometryService();
        Square square = creator.createSquare(2, service);
        Circle inscribedCircle = creator.createInscribedCircle(square, service);
        Square inscribedSquare = creator.createInscribedSquare(inscribedCircle, service);
        double areaRatio = service.findAreaRatio(square, inscribedSquare);
        GeometricReport reporter = new GeometricReport();
        reporter.reportSquareArea(square, inscribedSquare, areaRatio);
    }
}