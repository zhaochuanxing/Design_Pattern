package com.xing.gof.factory.idcard;

import com.xing.gof.factory.framework.Product;

public class IdCard extends Product {

    private String owner;

    public IdCard(String owner){
        this.owner = owner;
    }

    public String getOwner(){
        return this.owner;
    }

    @Override
    public void use() {
        System.out.println("use "+owner+" card");
    }
}
