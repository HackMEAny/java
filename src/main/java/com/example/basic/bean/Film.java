package com.example.basic.bean;

public class Film {

    Actor actor;

    public Film(Actor actor) {
        this.actor = actor;
    }

    public void startActing() {
        actor.act();
    }

}
