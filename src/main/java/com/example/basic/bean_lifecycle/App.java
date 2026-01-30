package com.example.basic.bean_lifecycle;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        System.out.println("**** Starting ****");
        context.getBean(Laptop.class).chargeLaptop();
        // context.getBean(Laptop.class).chargeLaptop();

        System.out.println("**** END ****");
    }
}
