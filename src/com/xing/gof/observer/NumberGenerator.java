package com.xing.gof.observer;

import java.util.ArrayList;
import java.util.Iterator;

public abstract class NumberGenerator {

    private ArrayList observerList = new ArrayList();

    public void addOberver(Observer oberver){
        this.observerList.add(oberver);
    }

    public void deleteOberver(Observer oberver){
        this.observerList.remove(oberver);
    }

    //发布消息
    public void notifyObervers(){
        Iterator iterator = observerList.iterator();
        while (iterator.hasNext()){
            Observer oberver = (Observer) iterator.next();
            oberver.update(this);
        }
    }

    public abstract int getNumber();//获取数值
    public abstract  void excute();//生成数值
}
