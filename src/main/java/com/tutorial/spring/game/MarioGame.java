package com.tutorial.spring.game;

public class MarioGame implements Game {

    public void up() {
        System.out.println("Up");
    }

    public void down() {
        System.out.println("Go to hole");
    }

    public void left() {
        System.out.println("Go to back side");
    }

    public void right() {
        System.out.println("Accelerate");
    }

}
