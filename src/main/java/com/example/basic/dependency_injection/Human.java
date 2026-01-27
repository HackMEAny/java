package com.example.basic.dependency_injection;

import org.springframework.stereotype.Component;

@Component
public class Human {
    // This is filed injection
    // @Autowired
    Air air;
    Water water;
    Food food;

    public Human(Air air, Water water, Food food) {
        this.air = air;
        this.water = water;
        this.food = food;
    }

    public void live() {
        if (air == null || water == null || food == null) {
            System.out.println("Died ...");
        } else {
            System.out.println("Alive ...");
        }
    }

    // @Autowired
    // public void setAir(Air air) {
    // this.air = air;
    // }

    // @Autowired
    // public void setWater(Water water) {
    // this.water = water;
    // }

    // @Autowired
    // public void setFood(Food food) {
    // this.food = food;
    // }

    public static void main(String args[]) {
        // Constructor based dependency injection
        Human human = new Human(new Air(), new Water(), new Food());

        // Dependency Injection via setter method (not receomended)
        // - higher chance of error missing or forget components
        // Human human = new Human();
        // human.setAir(new Air());
        // human.setWater(new Water());
        // human.setFood(new Food());

        human.live();
    }
}
