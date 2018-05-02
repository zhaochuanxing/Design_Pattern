package com.xing.gof.factory.idcard;

import com.xing.gof.factory.framework.Factory;
import com.xing.gof.factory.framework.Product;

import java.util.ArrayList;
import java.util.List;

public class IdCardFactory extends Factory {

    private List<String> ownerList = new ArrayList<String>();

    @Override
    protected Product createProduct(String owner) {

        return new IdCard(owner);
    }

    @Override
    protected void registerProduct(Product product) {
        ownerList.add(((IdCard)product).getOwner());
    }

    public List<String> getOwnerList(){
        return ownerList;
    }
}
