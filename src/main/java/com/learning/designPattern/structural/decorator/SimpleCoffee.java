package com.learning.designPattern.structural.decorator;

public class SimpleCoffee implements Coffee {
    @Override
    public String getDiscription() {
        return "Simple Coffee";
    }

    @Override
    public double getCost() {
        return 5.0;
    }
}
