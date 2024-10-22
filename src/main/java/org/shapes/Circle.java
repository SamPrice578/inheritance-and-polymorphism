package org.shapes;

public class Circle extends Shape{

    public int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        double pi = Math.PI;

        return pi * Math.pow(radius, 2);

    }
}
