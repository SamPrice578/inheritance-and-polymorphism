package org.example;

public abstract class Vehicle {
    String make;
    String model;
    String speed;
    Engine engine;

    public Vehicle(String make, String model) {
        this.make = make;
        this.model = model;
    }
}
