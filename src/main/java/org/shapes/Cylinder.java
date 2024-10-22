package org.shapes;

public class Cylinder extends Shape3D {
    int height;

    public Cylinder(Circle base, int height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateVolume() {
        return base.calculateArea() * height;
    }
}
