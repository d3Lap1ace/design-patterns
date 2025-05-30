package com.java.designPattern.example;

public class Main {
    public static void main(String[] args) {
        OriginObject originObject = new OriginObject();
        originObject.setName("Origin Name");
        originObject.setDescription("Origin Description");

        Adapeter adapter = new Adapeter(originObject);
        adapter.printName(originObject.getName());
        adapter.printDescription(originObject.getDescription());
    }
}
