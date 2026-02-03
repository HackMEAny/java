package com.example.basic.profile.m1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();

        context.getEnvironment().setActiveProfiles("gpay");
        context.register(AppConfig.class);
        context.refresh();

        context.getBean(PaymentProcessor.class).doPayment(2000);

    }
}
