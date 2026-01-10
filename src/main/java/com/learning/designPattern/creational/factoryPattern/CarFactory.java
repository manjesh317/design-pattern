package com.learning.designPattern.creational.factoryPattern;

public class CarFactory {
    public Car getCar(String carType) {
        if (carType.equalsIgnoreCase("SUV")) {
            return new Suv();
        } else if (carType.equalsIgnoreCase("Sedan")) {
            return new Sedan();
        } else if (carType.equalsIgnoreCase("Mini")) {
            return new Mini();
        } else {
            return null;
        }
    }
}