package com.example.basic.profile.m5_custom_annotation;

import org.springframework.stereotype.Component;

// @Profile("gpay")
@Component
@GpayProfile
public class GpayPaymentGateway implements PaymentGateway {

    @Override
    public void pay(int amount) {
        System.out.println("GPAY ...");
        System.out.println("Amount : " + amount);
    }

}
