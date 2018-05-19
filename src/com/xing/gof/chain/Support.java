package com.xing.gof.chain;

public abstract class Support {

    private String name;
    private Support next;

    public String getName() {
        return name;
    }

    //定义了构造函数，则就会覆盖默认的构造函数，系统不再提供默认的构造函数
    public Support(String name){
        this.name = name;
    }

    public Support setNext(Support next){
        this.next = next;
        return next;
    }

    //递归调用
    public final void support(Trouble trouble){
        if(resolve(trouble)){
            done(trouble);
        }else if(next!=null){
            next.support(trouble);
        }else{
            fail(trouble);
        }
    }

    //迭代调用
    public void supportLoop(Trouble trouble){
        Support support = this;
        while(support!=null){
            if(support.resolve(trouble)){
                //注意这里是加上support，否则就是还是第一个对象的调用
                support.done(trouble);
                break;
            }else if(support.next ==null){
                //注意这里是加上support，否则就是还是第一个对象的调用
                support.fail(trouble);
                break;
            }
            //走到这里则表示当前不能处理，也有后续的部门，可以转手
            support = support.next;
        }
    }

    public abstract boolean resolve(Trouble trouble);

    protected void done(Trouble trouble){
        System.out.println(trouble+" is resolved by "+this);
    }

    protected void fail(Trouble trouble){
        System.out.println(trouble+" can not be resolved "+this);
    }

    @Override
    public String toString() {
        return "Support{" +
                "name='" + name + '\'' +
                ", next=" + next +
                '}';
    }
}
