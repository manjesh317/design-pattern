package com.learning.designPattern.creational.factoryPattern;

public class Sedan implements Car {
    @Override
    public void assemble() {
        System.out.println("Sedan -- assembling");
    }
}