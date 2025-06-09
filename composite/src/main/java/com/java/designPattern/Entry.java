package com.java.designPattern;

/**
 * @classname design-patterns
 * @Auther d3Lap1ace
 * @Time 6/9/2025 10:25 PM Mon
 * @description
 * @Version 1.0
 * From the Laplace Demon
 */


public abstract class Entry {
    public abstract String getName();
    public abstract int getSize();
    public Entry add(Entry entry)throws FileTreatmentException{
        throw new FileTreatmentException();
    }
    public void printList(){
        printList("");
    }
    protected abstract void printList(String prefix);
    public String toString(){
        return getName()+"("+getSize()+")";
    }
}
