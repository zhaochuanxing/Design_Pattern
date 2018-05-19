package com.xing.gof.strategy;

/**
 * 对手势的封装，不仅仅是三个整数值
 */
public class Hand {

    public static final int HAND_STONE = 0;//石头
    public static final int HAND_SC = 1;//剪刀
    public static final int HAND_CLOTH = 2;//布
    private final int handleValue;

    private int fight(Hand hand) {
        if(this == hand){
            return 0;
        }else if((this.handleValue + 1) % 3 == hand.handleValue){
            //win
            //0 1;1 2;2 0;这三种情况，还真是精辟
            return 1;
        }else{
            //lose
            return -1;
        }
    }

    //静态变量，被所有的类所共享资源
    public static final Hand[] handList = {
      new Hand(HAND_STONE),new Hand(HAND_SC),new Hand(HAND_CLOTH)
    };

    public Hand(int handValue){
        this.handleValue = handValue;
    }

    private static final String[] nameList = {"石头","剪刀","布"};

    public static Hand getHand(int handleValue){
        return handList[handleValue%3];
    }

    public boolean isStrongerThan(Hand hand){
        return fight(hand) == 1;
    }

    public boolean isWeakThan(Hand hand){
        return fight(hand) == -1;
    }


    @Override
    public String toString(){
        return nameList[handleValue];
    }

}
