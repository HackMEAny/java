package com.example.basic.profile.m4_profile_configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(value = { GpayPaymentConfig.class, PaypalPaymentConfig.class })
public class AppConfig {

    @Bean
    public PaymentProcessor paymentProcessor(PaymentGateway paymentGateway) {
        return new PaymentProcessor(paymentGateway);
    }
}
