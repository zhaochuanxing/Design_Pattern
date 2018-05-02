package com.xing.gof.factory;

import com.xing.gof.factory.framework.Factory;
import com.xing.gof.factory.framework.Product;
import com.xing.gof.factory.idcard.IdCardFactory;

public class Main {

    public static void main(String[] args){
        Factory factory = new IdCardFactory();
        Product productOne = factory.create("one");
        Product productTwo = factory.create("two");
        productOne.use();
        productTwo.use();

    }
}
