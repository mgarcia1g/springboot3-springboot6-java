package com.springframework.learnspringframework;

public class SuperContraGame implements GamingConsole {
    @Override
    public void up(){
        System.out.println("Jump");
    }
    @Override
    public void down(){
        System.out.println("Kneel down");
    }
    @Override
    public void left(){
        System.out.println("Go back");
    }
    @Override
    public void right(){
        System.out.println("attack");
    }
}
