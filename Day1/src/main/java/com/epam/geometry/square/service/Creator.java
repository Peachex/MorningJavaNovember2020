package com.epam.geometry.square.service;

import com.epam.geometry.square.entity.Circle;
import com.epam.geometry.square.entity.Square;

public class Creator {
    public Square createSquare(double area, GeometryService service) {
        return new Square(service.findSquareLengthByArea(area), area);
    }

    public Circle createInscribedCircle(Square square, GeometryService service) {
        return new Circle(service.findRadiusBySquareLength(square));
    }

    public Square createInscribedSquare(Circle circle, GeometryService service) {
        double sideLength = service.findSquareLengthByRadius(circle);
        return new Square(sideLength, service.findArea(sideLength));
    }
}
