package com.java.designPattern.abstaract;

/**
 * @classname design-pattern
 * @Auther d3Lap1ace
 * @Time 23/4/2025 22:54 周三
 * @description
 * @Version 1.0
 * From the Laplace Demon
 */


public class StringDisplay extends AbstractDisplay {
    private String str;
    private int width;
    public StringDisplay(String str) {
        this.str = str;
    }

    @Override
    public void open() {
        printLine();
    }

    @Override
    public void print() {
        System.out.println(" | "+str+" | ");
    }

    @Override
    public void close() {
        printLine();
    }

    private void printLine() {
        System.out.println();
    }
}
