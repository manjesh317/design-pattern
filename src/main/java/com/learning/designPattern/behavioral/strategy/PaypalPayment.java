package com.learning.designPattern.behavioral.strategy;

public class PaypalPayment implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("making the payment of " + amount + " using Paypal");
    }
}
