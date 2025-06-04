package com.java.designPattern.exercise;

/**
 * @classname design-pattern
 * @Auther d3Lap1ace
 * @Time 27/4/2025 21:51 周日
 * @description
 * @Version 1.0
 * From the Laplace Demon
 */


public class Triple {
    private static final Triple[] triples = new Triple[3];

    static {
        for (int i = 0; i < 3; i++) {
            triples[i] = new Triple();
        }
    }
    private Triple() {
    }

    public static Triple getTriple(int index) {
        if (index < 0 || index >= 3) {
            throw new IllegalArgumentException("Index must be 0, 1, or 2.");
        }
        return triples[index];
    }

}
