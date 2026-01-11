package com.learning.designPattern.behavioral.strategy;

public class PaymentTest {
    public static void main(String[] args) {
        PaymentContext paymentContext = new PaymentContext(new CreditCardPayment());
        paymentContext.pay(111.11);

        paymentContext.setPaymentStrategy(new PaypalPayment());
        paymentContext.pay(151.11);

        paymentContext.setPaymentStrategy(new BankTransferPayment());
        paymentContext.pay(251.11);
    }
}
