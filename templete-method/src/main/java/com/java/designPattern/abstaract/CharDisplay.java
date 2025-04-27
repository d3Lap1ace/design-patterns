package com.java.designPattern.abstaract;

/**
 * @classname design-pattern
 * @Auther d3Lap1ace
 * @Time 23/4/2025 22:51 周三
 * @description
 * @Version 1.0
 * From the Laplace Demon
 */


public class CharDisplay extends AbstractDisplay{
    private  char ch;

    public CharDisplay(char ch) {
        this.ch = ch;
    }

    @Override
    public void open() {
        System.out.println("\"<<<\" = " + "<<<");
    }

    @Override
    public void print() {
        System.out.println("ch = " + ch);
    }

    @Override
    public void close() {
        System.out.println("\">>>\" = " + ">>>");
    }
}
