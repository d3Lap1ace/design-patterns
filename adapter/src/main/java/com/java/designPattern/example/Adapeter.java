package com.java.designPattern.example;

import lombok.Data;


public class Adapeter extends NewModthem {
    private OriginObject originObject;
    public Adapeter(OriginObject originObject) {
        this.originObject = originObject;
    }
    @Override
    public void printName(String name) {
        System.out.println("NewModther");
        this.originObject.printName(name);
    }

    @Override
    public void printDescription(String description) {
        System.out.println("NewModther");
        this.originObject.printDescription(description);
    }
}
