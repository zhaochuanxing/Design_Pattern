package com.xing.gof.adapter.object;


public class PrintBanner extends Print {

    private final Banner banner;

    public PrintBanner(String str){
        this.banner = new Banner(str);
    }
    @Override
    public void printWeak() {
        banner.showWithParen();
    }

    @Override
    public void printStrong() {
        banner.showWithAster();
    }
}
