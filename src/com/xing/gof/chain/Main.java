package com.xing.gof.chain;

public class Main {

    public static void main(String[] args){
        Support alice = new NoSupport("Alice");
        Support bob = new LimitSupport("Bob",100);
        Support charile = new SpecialSupport("Charlie",429);
        Support diana = new LimitSupport("Diana",200);
        Support elmo = new OddSupport("Elmo");
        Support fred = new LimitSupport("Fred",300);
        Support hero = new EvenSupport("Hero");

        //形成职责链 链式调用
        alice.setNext(bob).setNext(charile).setNext(diana).setNext(elmo).setNext(fred).setNext(hero);

        for(int i = 0;i<500;i++){
//            alice.support(new Trouble(i));
            alice.supportLoop(new Trouble(i));
        }
    }
}
