package org.vehicles;

public class Main {
    public static void main(String[] args) {

        Car emmanuelsCar = new Car("Polo", "VW");
        Motorcycle samsMotorcycle = new Motorcycle("Harley Davison", "Fancy", false);

        emmanuelsCar.accelerate();
        samsMotorcycle.accelerate();
    }
}