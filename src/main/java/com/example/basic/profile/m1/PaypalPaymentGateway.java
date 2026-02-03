package com.example.basic.profile.m1;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("paypal")
public class PaypalPaymentGateway implements PaymentGateway {

    @Override
    public void pay(int amount) {
        System.out.println("Pay Pal ...");
        System.out.println("Amount : " + amount);
    }

}
