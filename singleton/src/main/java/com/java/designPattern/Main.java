package com.java.designPattern;

import com.java.designPattern.example.Singleton;

public class Main {
    public static void main(String[] args) {
        System.out.println("start.");
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance1);
    }
}