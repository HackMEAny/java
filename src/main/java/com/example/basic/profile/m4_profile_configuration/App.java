package com.example.basic.profile.m4_profile_configuration;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();

        context.getEnvironment().setActiveProfiles("paypal");
        context.register(AppConfig.class);
        context.refresh();

        context.getBean(PaymentProcessor.class).doPayment(2000);

    }
}
