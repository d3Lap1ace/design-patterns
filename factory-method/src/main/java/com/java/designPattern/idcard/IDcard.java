package com.java.designPattern.idcard;

import com.java.designPattern.framework.Product;
import lombok.Data;

/**
 * @classname design-pattern
 * @Auther d3Lap1ace
 * @Time 7/1/2025 21:56 周二
 * @description
 * @Version 1.0
 * From the Laplace Demon
 */

@Data
public class IDcard extends Product {
    private String owner;
    IDcard(String owner){
        System.out.println("owner = " + owner);
        this.owner = owner;
    }
    @Override
    public void use() {
        System.out.println("use IDcard"+owner+"name");
    }
}
