package com.java.designPattern;

import lombok.Data;

/**
 * @classname design-pattern
 * @Auther d3Lap1ace
 * @Time 6/1/2025 21:40 周一
 * @description
 * @Version 1.0
 * From the Laplace Demon
 */

@Data
public class Banner {
    private String title;
    public Banner(String title) {
        this.title = title;
    }
    public void showWithParen(){
        System.out.println(("(" + title + ")"));
    }
    public void showWithAster(){
        System.out.println(("*" + title + "*"));
    }
}
