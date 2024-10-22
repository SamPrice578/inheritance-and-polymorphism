package org.shapes;

public class Cube extends Shape3D{

    public Cube(int size) {
        this(new Rectangle(size,size));
    }

    private Cube(Rectangle base) {
        this.base = base;
    }

    @Override
    public double calculateVolume() {
        return Math.pow(((Rectangle) base).width , 3);
    }
}
