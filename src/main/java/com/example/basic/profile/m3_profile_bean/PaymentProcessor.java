package com.example.basic.profile.m3_profile_bean;

public class PaymentProcessor {
    PaymentGateway paymentGateway;

    public PaymentProcessor(PaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }

    public void doPayment(int amount) {
        paymentGateway.pay(amount);
    }
}
