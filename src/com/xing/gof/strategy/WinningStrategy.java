package com.xing.gof.strategy;

import java.util.Random;

public class WinningStrategy implements Strategy {

    private final Random random;
    private boolean win;
    private Hand preHand;

    public WinningStrategy(int seed){
        random = new Random(seed);
    }

    @Override
    public Hand nextHand() {
        if(!win){
            preHand = Hand.getHand(random.nextInt(3));
        }
        return preHand;
    }

    @Override
    public void study(boolean win) {
        this.win = win;
    }
}
