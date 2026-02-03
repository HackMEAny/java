package com.example.basic.profile.m2;

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
}
