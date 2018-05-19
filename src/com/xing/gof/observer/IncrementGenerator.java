package com.xing.gof.observer;

public class IncrementGenerator extends NumberGenerator {

    private final int start;
    private final int end;
    private final int step;
    private int number;

    public IncrementGenerator(int start, int end, int step){
        this.start = start;
        this.end = end;
        this.step = step;
        this.number = start;
    }

    @Override
    public int getNumber() {
        return number;
    }

    @Override
    public void excute() {
        for(int index = start;index<=end;index += step){
            number = index;
            notifyObervers();
        }
    }
}
