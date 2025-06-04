package com.java.designPattern.exercise;

/**
 * @classname design-pattern
 * @Auther d3Lap1ace
 * @Time 27/4/2025 21:39 周日
 * @description
 * @Version 1.0
 * From the Laplace Demon
 */


public class TicketMaker {
    private int ticket;
    private TicketMaker(){
        this.ticket = 1000;
        System.out.println("Singleton is created");
    }

    private static TicketMaker ticketMaker = new TicketMaker();

    public static TicketMaker getInstance(){
        return ticketMaker;
    }

    public int getTicketMaker(){
        return ticketMaker.ticket--;
    }
}
