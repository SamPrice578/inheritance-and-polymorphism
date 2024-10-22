package org.shapes;

public class Pyramid extends Shape3D{

    int height;

    public Pyramid(Shape base, int height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateVolume() {
        return (base.calculateArea() * height) / 3;
    }
}
