package com.xing.gof.chain;

public class LimitSupport extends Support {

    private final int limit;

    //构造函数可以不一样，但是需要的是正确调用父类的构造函数
    public LimitSupport(String name, int limit) {
        super(name);
        this.limit = limit;
    }

    @Override
    public boolean resolve(Trouble trouble) {
        if(trouble.getNumber()<limit){
            return true;
        }
        return false;
    }


}
