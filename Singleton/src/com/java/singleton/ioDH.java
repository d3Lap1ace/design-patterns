package com.java.singleton;

/**
 * @classname Design-patterns
 * @Auther d3Lap1ace
 * @Time 5/15/2024 3:07 PM Wed
 * @description
 * @Version 1.0
 * From the Laplace Demon
 */


public class ioDH {
    private static class HolderClass{
        private static ioDH instance = new ioDH();
    }
    private ioDH(){}

    public static ioDH getInstance() {
        return HolderClass.instance;
    }
}
