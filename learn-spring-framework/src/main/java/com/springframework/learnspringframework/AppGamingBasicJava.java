package com.springframework.learnspringframework;

public class AppGamingBasicJava {
    public static void main(String[] args){
        // Tightly coupled example
        var marioGame = new MarioGame();
        SuperContraGame superContraGame = new SuperContraGame();
        var gameRunner = new GameRunner(marioGame);
        var gameRunner2 = new GameRunner(superContraGame);

        System.out.println("MarioGame:");
        gameRunner.run();
        System.out.println("");
        System.out.println("superContraGame");
        gameRunner2.run();

    }
}
