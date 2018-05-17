package com.xing.gof.abstract_factory.factory;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

public abstract class Page {

    protected String title;
    protected String author;
    protected List<Item> contentList = new ArrayList<Item>();

    public Page(String title,String author){
        this.title = title;
        this.author = author;
    }

    public void add(Item item){
        contentList.add(item);
    }

    public void output(){
        try{
            String fileName = title+".html";
            Writer writer = new FileWriter(fileName);
            writer.write(this.makeHtml());
            writer.close();
        }catch (IOException ioe){
            ioe.printStackTrace();
        }
    }

    protected abstract String makeHtml();


}
