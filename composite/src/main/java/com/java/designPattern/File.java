package com.java.designPattern;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @classname design-patterns
 * @Auther d3Lap1ace
 * @Time 6/9/2025 10:29 PM Mon
 * @description
 * @Version 1.0
 * From the Laplace Demon
 */


@Data
@EqualsAndHashCode(callSuper = true)
public class File extends Entry{
    private String name;
    private int size;

    public File(String name, int size){
        this.name = name;
        this.size = size;
    }

    @Override
    protected void printList(String prefix) {
        System.out.println(prefix+"/" + this);
    }
}
