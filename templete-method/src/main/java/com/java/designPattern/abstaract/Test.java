package com.java.designPattern.abstaract;

/**
 * @classname design-pattern
 * @Auther d3Lap1ace
 * @Time 23/4/2025 23:03 周三
 * @description
 * @Version 1.0
 * From the Laplace Demon
 */


public class Test {
    public static void main(String[] args) {
        AbstractDisplay d1 = new CharDisplay('H');
        AbstractDisplay d2 = new StringDisplay("hello,world");
        AbstractDisplay d3 = new StringDisplay("你好,世界");

        d1.display();
        d2.display();
        d3.display();
    }
}
