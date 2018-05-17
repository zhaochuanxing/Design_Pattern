package com.xing.gof.abstract_factory.factory;

public abstract class Link extends Item {

    protected final String url;

    public Link(String cap , String url) {
        super(cap);
        this.url = url;
    }
}
