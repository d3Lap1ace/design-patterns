package com.java.designPattern.abstaract;

/**
 * @classname design-pattern
 * @Auther d3Lap1ace
 * @Time 23/4/2025 22:45 周三
 * @description
 * @Version 1.0
 * From the Laplace Demon
 */


public abstract class AbstractDisplay {
    public abstract void open();
    public abstract void print();
    public abstract void close();
    public final void display(){
        open();
        for (int i = 0; i < 5; i++) {
            print();
        }
        close();
    }
}
