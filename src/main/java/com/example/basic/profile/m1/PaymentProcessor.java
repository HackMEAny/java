package com.example.basic.profile.m1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentProcessor {
    @Autowired
    PaymentGateway paymentGateway;

    public void doPayment(int amount) {
        paymentGateway.pay(amount);
    }
}
