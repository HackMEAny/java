package com.example.basic.profile.m4_profile_configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
@Profile("gpay")
public class GpayPaymentConfig {
    @Bean
    public GpayPaymentGateway GpayPaymentGateway() {
        return new GpayPaymentGateway();
    }
}
