package com.java.designPattern.coffee;

/**
 * @classname design-patterns
 * @Auther d3Lap1ace
 * @Time 6/9/2025 11:32 PM Mon
 * @description
 * @Version 1.0
 * From the Laplace Demon
 */


public class ConcreteComponent implements Coffee {
    @Override
    public String getDescription() {
        return "simple coffee";
    }

    @Override
    public double getCost() {
        return 5.0;
    }
}
