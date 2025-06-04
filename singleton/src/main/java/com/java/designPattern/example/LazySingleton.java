package com.java.designPattern.example;

/**
 * @classname design-pattern
 * @Auther d3Lap1ace
 * @Time 27/4/2025 22:11 周日
 * @description
 * @Version 1.0
 * From the Laplace Demon
 */


public class LazySingleton {
    private static LazySingleton instance = null;
    private LazySingleton() {}
    public static LazySingleton getInstance() {
        if (instance == null) {
            synchronized (LazySingleton.class) {
                if (instance == null) {
                    instance = new LazySingleton();
                }
            }
        }
        return instance;
    }
}
