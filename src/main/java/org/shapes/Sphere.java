package org.shapes;

public class Sphere extends Shape3D {

    public Sphere(Circle base) {
        this.base = base;
    }

    @Override
    public double calculateVolume() {
        return ((double) 4 / 3) * Math.PI * Math.pow(((Circle) base).radius, 3);
    }
}
