package com.java.factory;

/**
 * @classname Design-patterns
 * @Auther d3Lap1ace
 * @Time 5/15/2024 3:25 PM Wed
 * @description
 * @Version 1.0
 * From the Laplace Demon
 */


public class LoggerFactoryimpl implements LoggerFactory{

    @Override
    public Logger createLogger() {
        Logger logger = new Loggerimpl();
        return logger;
    }
}
