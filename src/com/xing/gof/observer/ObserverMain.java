package com.xing.gof.observer;

public class ObserverMain {

    public static void main(String[] args){
//        NumberGenerator numberGenerator = new RandomNumberGenerator();
        NumberGenerator numberGenerator = new IncrementGenerator(1,20,2);
        Observer digitOberver = new DigitOberver();
        Observer graphOberver = new GraphObserver();
        Observer concreteObserver = new ConcreteObserver();
        numberGenerator.addOberver(digitOberver);
        numberGenerator.addOberver(graphOberver);
        numberGenerator.addOberver(concreteObserver);

        numberGenerator.excute();
    }
}
