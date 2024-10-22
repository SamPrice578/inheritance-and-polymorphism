package org.shapes;

public class Prism extends Shape3D {

    int height;

    public Prism(Shape base, int height) {
        this.base = base;
        this.height = height;
    }

    public double calculateVolume() {
        return base.calculateArea() * height;
    }
}
