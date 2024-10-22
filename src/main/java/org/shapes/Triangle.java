package org.shapes;

public class Triangle extends Shape{
    int base;
    int height;

    public Triangle(int base, int height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateArea () {
        return (base * height) / 2.0;
    }

}
