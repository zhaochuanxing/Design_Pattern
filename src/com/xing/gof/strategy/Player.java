package com.xing.gof.strategy;

public class Player {

    private final String name;
    private final Strategy strategy;
    private int winCount;
    private int gameCount;
    private int loseCount;

    public Player(String name, Strategy strategy){
        this.name = name;
        this.strategy = strategy;
    }

    public Hand nextHand(){
        return strategy.nextHand();
    }

    public void win(){
        strategy.study(true);
        winCount ++;
        gameCount ++;
    }

    public void lose(){
        strategy.study(false);
        loseCount ++;
        gameCount ++;
    }

    //平局
    public void even(){
        gameCount ++;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", strategy=" + strategy +
                ", winCount=" + winCount +
                ", gameCount=" + gameCount +
                ", loseCount=" + loseCount +
                '}';
    }
}
