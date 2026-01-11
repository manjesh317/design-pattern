package com.learning.designPattern.structural.decorator;

public class CreamDecorator extends CoffeeDecorator{

    public CreamDecorator(Coffee coffee) {
        super(coffee);
    }

    @Override
    public String getDiscription() {
        return coffee.getDiscription()+ " , Cream";
    }

    @Override
    public double getCost() {
        return coffee.getCost()+4.5; //additional sugar cost
    }
}
