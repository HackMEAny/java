package com.example.basic.bean_lifecycle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import jakarta.annotation.PostConstruct;

@Component
@Scope("prototype")
public class Laptop {

    private Battery battery;

    public Laptop() {
        System.out.println("Laptop constructor initializing ...");
    }

    @Autowired
    public void setBattery(Battery battery) {
        System.out.println("Setting setter based dependency injection ");
        this.battery = battery;
    }

    public void initMethod() {
        System.out.println("Init method initiated ...");
    }

    @PostConstruct
    public void postConstruct() {
        System.out.println("Post construct ...");
    }

    public void chargeLaptop() {
        battery.charge();
    }
}
