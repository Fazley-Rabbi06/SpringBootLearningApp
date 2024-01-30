package com.tutorial.spring.game;

public class GameRunner {

    Game game;

    GameRunner(Game game){
        this.game = game;
    }

    public void run(){
        System.out.println("Game Running: ");
        game.up();
        game.down();
        game.left();
        game.right();
    }
}
