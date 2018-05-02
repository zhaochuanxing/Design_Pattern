package com.xing.gof.builder;

public class Director {

    private final Builder builder;

    public Director(Builder builder){
        this.builder = builder;
    }

    public String construct(){
        builder.makeTitle("begin a good day");
        builder.makeString("good work");
        builder.makeItems(new String[]{"come","on"});
        builder.finish();
        return builder.getResult();
    }
}
