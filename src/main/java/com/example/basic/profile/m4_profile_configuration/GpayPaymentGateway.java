package com.example.basic.profile.m4_profile_configuration;

// @Profile("gpay")
public class GpayPaymentGateway implements PaymentGateway {

    @Override
    public void pay(int amount) {
        System.out.println("GPAY ...");
        System.out.println("Amount : " + amount);
    }

}
