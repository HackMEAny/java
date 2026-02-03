package com.example.basic.profile.m5_custom_annotation;

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
