package com.java.designPattern.example;

import lombok.Data;

@Data
public class OriginObject {
    private String name;
    private String description;

    public void printName(String name){
        System.out.println("Name: " + name);
    }
    public void printDescription(String description){
        System.out.println("Description: " + description);
    }
}
