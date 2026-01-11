package com.learning.designPattern.structural.decorator;

public class MilkDecorator extends CoffeeDecorator{
    public MilkDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDiscription() {
        return coffee.getDiscription() + " , Milk";
    }

    @Override
    public double getCost() {
        return coffee.getCost() + 1.5; //additional milk cost
    }
}
