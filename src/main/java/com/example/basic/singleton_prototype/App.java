package com.example.basic.singleton_prototype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        // Singleton returns same memory address or refers same object
        ApplicationContext applicationContext1 = new AnnotationConfigApplicationContext(Person_Singleton.class);

        Person_Singleton person1 = applicationContext1.getBean(Person_Singleton.class);
        System.out.println(person1);

        Person_Singleton person2 = applicationContext1.getBean(Person_Singleton.class);
        System.out.println(person2);

        // Prototype returns different memory address or different object everytime it
        // calls

        ApplicationContext applicationContext2 = new AnnotationConfigApplicationContext(Person_Prototype.class);

        Person_Prototype person3 = applicationContext2.getBean(Person_Prototype.class);
        System.out.println(person3);

        Person_Prototype person4 = applicationContext2.getBean(Person_Prototype.class);
        System.out.println(person4);
    }
}
