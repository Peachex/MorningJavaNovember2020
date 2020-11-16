package com.epam.geometry.square.main;

import com.epam.geometry.square.entity.Circle;
import com.epam.geometry.square.entity.Square;
import com.epam.geometry.square.report.GeometricReport;
import com.epam.geometry.square.service.GeometryService;

public class ProjectMain {
    public static void main(String[] args) {
        double sideLength = 2;
        Square square = new Square(sideLength);
        GeometryService service = new GeometryService();
        Circle inscribedCircle = new Circle(service.findRadiusBySquareLength(square));
        Square inscribedSquare = new Square(service.findSquareLengthByRadius(inscribedCircle));
        double squareArea = service.findArea(square);
        double inscribedSquareArea = service.findArea(inscribedSquare);
        double areaRatio = service.findAreaRatio(squareArea, inscribedSquareArea);
        GeometricReport reporter = new GeometricReport();
        reporter.reportSquareArea(squareArea, inscribedSquareArea, areaRatio);
    }
}