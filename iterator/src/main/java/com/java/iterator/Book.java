package com.java.iterator;

import lombok.Data;

/**
 * @classname design-pattern
 * @Auther d3Lap1ace
 * @Time 1/1/2025 12:25 周三
 * @description
 * @Version 1.0
 * From the Laplace Demon
 */

@Data
public class Book {
    private String title;

    public Book(String title) {
        this.title = title;
    }

    public Book setBook(String title){
        this.title = title;
        return this;
    }

}
