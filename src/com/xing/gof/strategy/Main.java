package com.xing.gof.strategy;

public class Main {

    public static void main(String[] args){
        if(args.length != 2){
            System.out.println("Useage:java main random seed1 seed2");
            System.exit(0);
        }
        int seed1 = Integer.parseInt(args[0]);
        int seed2 = Integer.parseInt(args[1]);

        Player playerOne = new Player("zhao",new WinningStrategy(seed1));
        Player playerTwo = new Player("chuan",new ProbStrategy(seed2));

        for(int i=0;i<10000;i++){
            Hand nextHand1 = playerOne.nextHand();
            Hand nextHand2 = playerTwo.nextHand();
            if(nextHand1.isStrongerThan(nextHand2)){
                System.out.println("winer: "+playerOne);
                playerOne.win();
                playerTwo.lose();
            }else if(nextHand2.isStrongerThan(nextHand1)){
                System.out.println("winer: "+playerTwo);
                playerOne.lose();
                playerTwo.win();
            }else{
                System.out.println("even");
                playerOne.even();
                playerTwo.even();
            }
        }

        System.out.println("total result");
        System.out.println(playerOne);
        System.out.println(playerTwo);
    }
}
