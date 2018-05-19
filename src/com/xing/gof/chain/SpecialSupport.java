package com.xing.gof.chain;

public class SpecialSupport extends Support {

    private final int number;

    public SpecialSupport(String name, int number){
        super(name);
        this.number = number;
    }

    @Override
    public boolean resolve(Trouble trouble) {
        //只会处理特定的数字
        if(trouble.getNumber() == number){
            return true;
        }
        return false;
    }


}
