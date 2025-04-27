package com.java.designPattern;

import java.awt.print.Printable;

/**
 * @classname design-pattern
 * @Auther d3Lap1ace
 * @Time 6/1/2025 21:44 周一
 * @description
 * @Version 1.0
 * From the Laplace Demon
 */


public class PrintBanner extends Banner implements Print {
    public PrintBanner(String title) {
        super(title);
    }

    @Override
    public void printWeak() {
        showWithParen();
    }

    @Override
    public void printStrong() {
        showWithAster();
    }
}
