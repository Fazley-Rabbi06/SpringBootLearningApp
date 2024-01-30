package com.tutorial.spring.game;

public class AppBasicGameJava {

    public static void main(String[] args) {
        MarioGame marioGame = new MarioGame();
        SuperContraGame superContraGame = new SuperContraGame();
        GameRunner gameRunner = new GameRunner(marioGame);
        gameRunner.run();

    }

}
