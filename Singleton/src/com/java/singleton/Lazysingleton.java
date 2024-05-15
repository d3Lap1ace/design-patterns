package com.java.singleton;

/**
 * @classname Design-patterns
 * @Auther d3Lap1ace
 * @Time 5/15/2024 3:02 PM Wed
 * @description
 * @Version 1.0
 * From the Laplace Demon
 */


public class Lazysingleton {
    public static Lazysingleton getInstance() {
        if(instance == null){
            synchronized (Lazysingleton.class){
                if(instance == null){
                    instance = new Lazysingleton();
                }
            }
        }
        return instance;
    }
    private static Lazysingleton instance = null;
    private Lazysingleton(){};
}
