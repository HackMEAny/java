package com.example.basic.profile.m5_custom_annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentProcessor {
    @Autowired
    PaymentGateway paymentGateway;

    public PaymentProcessor(PaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }

    public void doPayment(int amount) {
        paymentGateway.pay(amount);
    }
}
