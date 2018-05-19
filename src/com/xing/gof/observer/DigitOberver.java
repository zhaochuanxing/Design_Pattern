package com.xing.gof.observer;

public class DigitOberver implements Observer {
    @Override
    public void update(NumberGenerator generator) {
        System.out.println("DigitOberver "+generator.getNumber());
        try {
            Thread.sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
