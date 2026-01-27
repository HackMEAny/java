package com.example.basic.singleton_prototype;

import org.springframework.context.annotation.Scope;

@Scope("singleton")
public class Person_Singleton {
    public Person_Singleton() {
        System.out.println("Person ...");
    }
}
