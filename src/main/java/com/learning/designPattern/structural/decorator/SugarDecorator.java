package com.learning.designPattern.structural.decorator;

public class SugarDecorator extends CoffeeDecorator{

    public SugarDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDiscription() {
        return coffee.getDiscription()+ " , Sugar";
    }

    @Override
    public double getCost() {
        return coffee.getCost()+0.5; //additional sugar cost
    }
}
