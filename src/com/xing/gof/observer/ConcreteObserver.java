package com.xing.gof.observer;

public class ConcreteObserver implements Observer {

    @Override
    public void update(NumberGenerator generator) {
        int number = generator.getNumber();
        System.out.println("Concreate "+number);
    }
}
