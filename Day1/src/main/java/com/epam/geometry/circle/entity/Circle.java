package com.epam.geometry.circle.entity;

public class Circle {
    private double radius;
    private double circleLength;
    private  double area;

    public Circle(double radius, double circleLength, double area) {
        this.radius = radius;
        this.circleLength = circleLength;
        this.area = area;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getCircleLength() {
        return this.circleLength;
    }

    public void setCircleLength(double circleLength) {
        this.circleLength = circleLength;
    }

    public double getArea() {
        return this.area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Circle{");
        sb.append("radius=").append(radius);
        sb.append(", circleLength=").append(circleLength);
        sb.append(", area=").append(area);
        sb.append('}');
        return sb.toString();
    }
}
