package com.example.basic.bean_lifecycle;

import org.springframework.stereotype.Component;

@Component
public class Battery {
    public void charge() {
        System.out.println("Charging ...");
    }
}
