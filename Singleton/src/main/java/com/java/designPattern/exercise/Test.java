package com.java.designPattern.exercise;

/**
 * @classname design-pattern
 * @Auther d3Lap1ace
 * @Time 27/4/2025 21:44 周日
 * @description
 * @Version 1.0
 * From the Laplace Demon
 */


public class Test {
    public static void main(String[] args) {
        TicketMaker instance = TicketMaker.getInstance();
        TicketMaker instance1 = TicketMaker.getInstance();
        TicketMaker instance2 = TicketMaker.getInstance();

        int ticketMaker = instance2.getTicketMaker();
        int ticketMaker1 = instance1.getTicketMaker();
        int ticketMaker2 = instance.getTicketMaker();
        int ticketMaker3 = instance2.getTicketMaker();
        System.out.println("ticketMaker = " + ticketMaker);
        System.out.println("ticketMaker1 = " + ticketMaker1);
        System.out.println("ticketMaker2 = " + ticketMaker2);
        System.out.println("ticketMaker3 = " + ticketMaker3);
    }
}
