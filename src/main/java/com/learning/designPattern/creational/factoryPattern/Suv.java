package com.learning.designPattern.creational.factoryPattern;

public class Suv implements Car {
    @Override
    public void assemble() {
        System.out.println("SUV -- assembling");
    }
}