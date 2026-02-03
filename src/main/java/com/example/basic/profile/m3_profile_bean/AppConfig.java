package com.example.basic.profile.m3_profile_bean;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@ComponentScan
public class AppConfig {

    @Bean
    @Profile("gpay")
    public GpayPaymentGateway GpayPaymentGateway() {
        return new GpayPaymentGateway();
    }

    @Bean
    @Profile("paypal")
    public PaypalPaymentGateway paypalPaymentGateway() {
        return new PaypalPaymentGateway();
    }

    @Bean
    public PaymentProcessor paymentProcessor(PaymentGateway paymentGateway) {
        return new PaymentProcessor(paymentGateway);
    }
}
