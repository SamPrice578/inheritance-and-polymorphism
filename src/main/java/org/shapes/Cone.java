package org.shapes;

public class Cone extends Shape3D{
    int height;

    public Cone(Circle base, int height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double calculateVolume() {
        return (base.calculateArea() * height) / 3;
    }
}
