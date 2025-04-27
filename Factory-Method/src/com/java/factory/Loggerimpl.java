package com.java.factory;

/**
 * @classname Design-patterns
 * @Auther d3Lap1ace
 * @Time 5/15/2024 3:24 PM Wed
 * @description
 * @Version 1.0
 * From the Laplace Demon
 */


public class Loggerimpl implements Logger{
    @Override
    public void writeLog() {
        System.out.println("具体产品");
    }
}
