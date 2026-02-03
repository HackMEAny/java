package com.example.basic.profile.m3_profile_bean;

// @Profile("gpay")
public class GpayPaymentGateway implements PaymentGateway {

    @Override
    public void pay(int amount) {
        System.out.println("GPAY ...");
        System.out.println("Amount : " + amount);
    }

}
