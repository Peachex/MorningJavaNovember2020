package com.epam.geometry.square.entity;

public class Square {
    private double sideLength;
    private double area;

    public Square(double sideLength, double area) {
        this.sideLength = sideLength;
        this.area = area;
    }

    public double getSideLength() {
        return this.sideLength;
    }

    public void setSideLength(double sideLength) {
        this.sideLength = sideLength;
    }

    public double getArea() {
        return this.area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Square{");
        sb.append("sideLength=").append(sideLength);
        sb.append(", area=").append(area);
        sb.append('}');
        return sb.toString();
    }
}