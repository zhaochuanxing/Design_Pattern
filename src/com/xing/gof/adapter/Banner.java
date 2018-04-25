package com.xing.gof.adapter;

public class Banner {
    private String str;

    public Banner(String value){
        str = value;
    }

    public void showWithParen(){
        System.out.println("("+str+")");
    }

    public void showWithAster(){
        System.out.println("*"+str+"*");
    }
}
