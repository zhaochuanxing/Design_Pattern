package com.xing.gof.abstract_factory.factory;

import java.util.ArrayList;

public abstract class Tray extends Item {

    protected ArrayList<Item> itemList = new ArrayList<Item>();

    public Tray(String caption){
        super(caption);
    }

    public void add(Item item){
        itemList.add(item);
    }
}
