package com.example.basic.profile.m5_custom_annotation;

import org.springframework.stereotype.Component;

// @Profile("paypal")
@Component
@PaypalProfile
public class PaypalPaymentGateway implements PaymentGateway {

    @Override
    public void pay(int amount) {
        System.out.println("Pay Pal ...");
        System.out.println("Amount : " + amount);
    }

}
