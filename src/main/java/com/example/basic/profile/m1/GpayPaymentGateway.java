package com.example.basic.profile.m1;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("gpay")
public class GpayPaymentGateway implements PaymentGateway {

    @Override
    public void pay(int amount) {
        System.out.println("GPAY ...");
        System.out.println("Amount : " + amount);
    }

}
