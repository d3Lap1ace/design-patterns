package com.java.designPattern.coffee;

/**
 * @classname design-pattern
 * @Auther d3Lap1ace
 * @Time 8/1/2025 20:50 周三
 * @description
 * @Version 1.0
 * From the Laplace Demon
 */


public class Singleton {
    private Singleton(){
        System.out.println("Singleton is created");
    }
    private static Singleton singleton = new Singleton();

    public static Singleton getInstance(){
        return singleton;
    }

}
