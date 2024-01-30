package com.tutorial.spring.game;

public class SuperContraGame implements Game{
    public void up() {
        System.out.println(" SuperContra Up");
    }

    public void down() {
        System.out.println("SuperContra Go to hole");
    }

    public void left() {
        System.out.println("SuperContra Go to back side");
    }

    public void right() {
        System.out.println("SuperContra Accelerate");
    }
}
