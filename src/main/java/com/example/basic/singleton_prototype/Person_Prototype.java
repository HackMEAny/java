package com.example.basic.singleton_prototype;

import org.springframework.context.annotation.Scope;

@Scope("prototype")
public class Person_Prototype {
    public Person_Prototype() {
        System.out.println("Scope Prototype ...");
        System.out.println(" - by default @Lazy i.e load in memory on-demand or on-call");
    }
}
