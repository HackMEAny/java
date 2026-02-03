package com.example.basic.profile.m4_profile_configuration;

public class PaymentProcessor {
    PaymentGateway paymentGateway;

    public PaymentProcessor(PaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }

    public void doPayment(int amount) {
        paymentGateway.pay(amount);
    }
}
