package com.java.designPattern.idcard;

import com.java.designPattern.framework.Factory;
import com.java.designPattern.framework.Product;

import java.util.ArrayList;
import java.util.List;

/**
 * @classname design-pattern
 * @Auther d3Lap1ace
 * @Time 7/1/2025 21:58 周二
 * @description
 * @Version 1.0
 * From the Laplace Demon
 */


public class IDcardFactory extends Factory {
    private List owners = new ArrayList();
    @Override
    protected Product createProduct(String owner) {
        return new IDcard(owner);
    }

    @Override
    protected void regosterProduct(Product p) {
        owners.add(((IDcard)p).getOwner());
    }

    public List getOwners() {
        return owners;
    }
}
