package com.example.basic.bean;

// @Component
// @Primary
// You have to add @Component & @Primary to get it active in bean level & manage via spring
public class KK implements Actor {

    @Override
    public void act() {
        System.out.println("KK on stage ...");
    }

}
