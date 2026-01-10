package com.learning.designPattern.creational.factoryPattern;

public class CarTest{
    public static void main(String[] args) {
        CarFactory carFactory = new CarFactory();

        Car suvCar = carFactory.getCar("Suv");
        suvCar.assemble();

        Car miniCar = carFactory.getCar("Mini");
        miniCar.assemble();

        Car sedanCar = carFactory.getCar("Sedan");
        sedanCar.assemble();
    }
}