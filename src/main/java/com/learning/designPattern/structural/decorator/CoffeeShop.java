package com.learning.designPattern.structural.decorator;

public class CoffeeShop {

    public static void main(String[] args) {

        Coffee myCoffee = new SimpleCoffee();
        System.out.println(myCoffee.getDiscription()+ " , price: $"+myCoffee.getCost());

        //add extra milk
        myCoffee = new MilkDecorator(myCoffee);
        System.out.println(myCoffee.getDiscription()+ " , price: $"+myCoffee.getCost());

        //add extra sugar
        myCoffee = new SugarDecorator(myCoffee);
        System.out.println(myCoffee.getDiscription()+ " , price: $"+myCoffee.getCost());

        //add extra cream
        myCoffee = new CreamDecorator(myCoffee);
        System.out.println(myCoffee.getDiscription()+ " , price: $"+myCoffee.getCost());

        System.out.println("final coffee cost: $"+myCoffee.getCost());

    }
}
