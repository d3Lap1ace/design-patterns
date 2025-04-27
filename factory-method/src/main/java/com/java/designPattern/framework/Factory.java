package com.java.designPattern.framework;

/**
 * @classname design-pattern
 * @Auther d3Lap1ace
 * @Time 7/1/2025 21:55 周二
 * @description
 * @Version 1.0
 * From the Laplace Demon
 */


public abstract class Factory {
    public final Product create(String owner){
        Product p = createProduct(owner);
        regosterProduct(p);
        return p;
    }
    protected abstract Product createProduct(String owner);
    protected abstract void regosterProduct(Product p);
}
