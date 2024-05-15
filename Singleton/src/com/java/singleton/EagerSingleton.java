package com.java.singleton;

/**
 * @classname Design-patterns
 * @Auther d3Lap1ace
 * @Time 5/15/2024 3:05 PM Wed
 * @description
 * @Version 1.0
 * From the Laplace Demon
 */


public class EagerSingleton {
    
    private static EagerSingleton instance = new EagerSingleton();
    private EagerSingleton(){};

    public static EagerSingleton getInstance() {
        return instance;
    }

}
