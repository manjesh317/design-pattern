package com.learning.designPattern.structural.decorator;

public class CoffeeDecorator implements Coffee {

    protected Coffee coffee;

    public CoffeeDecorator(Coffee coffee) {
        this.coffee = coffee;
    }


    @Override
    public String getDiscription() {
        return coffee.getDiscription();
    }

    @Override
    public double getCost() {
        return coffee.getCost();
    }
}
