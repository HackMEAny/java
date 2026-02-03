package com.example.basic.profile.m4_profile_configuration;

// @Profile("paypal")
public class PaypalPaymentGateway implements PaymentGateway {

    @Override
    public void pay(int amount) {
        System.out.println("Pay Pal ...");
        System.out.println("Amount : " + amount);
    }

}
