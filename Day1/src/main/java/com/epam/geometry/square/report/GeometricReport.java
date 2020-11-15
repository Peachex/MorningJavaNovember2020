package com.epam.geometry.square.report;

import com.epam.geometry.square.entity.Square;

public class GeometricReport {
    public void reportSquareArea(Square square, Square inscribedSquare, double areaRatio) {
        System.out.println("S1 = " + square.getArea() + "\nS2 = " + inscribedSquare.getArea() + "\nS1/S2 = " + areaRatio);
    }
}