package com.xing.gof.chain;

public class NoSupport extends Support {


    //需要提供一个构造函数，并调用父类的构造函数,这样才能初始化完成对象
    public NoSupport(String name) {
        super(name);
    }

    @Override
    public boolean resolve(Trouble trouble) {
        return false;
    }
}
