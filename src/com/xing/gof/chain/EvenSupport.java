package com.xing.gof.chain;

public class EvenSupport extends Support {

    public EvenSupport(String name) {
        super(name);
    }

    @Override
    public boolean resolve(Trouble trouble) {
        if(trouble.getNumber() % 2 == 0){
            return true;
        }
        return false;
    }
}
