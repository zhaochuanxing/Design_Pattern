package com.xing.gof.adapter;

public class PrintBanner extends Banner implements Print {

    public PrintBanner(String value) {
        super(value);
    }

    @Override
    public void printWeak() {
        showWithParen();
    }

    @Override
    public void printStrong() {
        showWithAster();
    }
}
