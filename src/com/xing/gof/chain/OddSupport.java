package com.xing.gof.chain;

public class OddSupport extends Support {

    public OddSupport(String name){
        super(name);
    }

    @Override
    public boolean resolve(Trouble trouble) {
        //只会处理奇数的情况
        if(trouble.getNumber() % 2 == 1){
            return true;
        }
        return false;
    }
}
