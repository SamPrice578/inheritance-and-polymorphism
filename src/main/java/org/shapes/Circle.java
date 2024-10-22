package org.shapes;

public class Circle extends Shape{

    int radius;

    public Circle(int radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        double pi = 22.0/7.0;

        return pi * Math.pow(radius, 2);

    }
}
