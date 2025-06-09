package com.java.designPattern.coffee;

public class ChocolateDecorator extends CoffeeDecorator {
    public ChocolateDecorator(Coffee coffee) {
        super(coffee);
    }

    public String getDescription() {
        return coffee.getDescription() + ", Chocolate";
    }

    public double getCost() {
        return coffee.getCost() + 2.0;
    }
}
