package com.example.basic.profile.m4_profile_configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("paypal")
public class PaypalPaymentConfig {
    @Bean
    public PaypalPaymentGateway paypalPaymentGateway() {
        return new PaypalPaymentGateway();
    }
}
