package com.java.designPattern;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @classname design-patterns
 * @Auther d3Lap1ace
 * @Time 6/9/2025 10:31 PM Mon
 * @description
 * @Version 1.0
 * From the Laplace Demon
 */


@Data
@EqualsAndHashCode(callSuper = true)
public class Dirctory extends Entry{
    private String name;
    private List<Entry> directory = new ArrayList<Entry>();

    public Dirctory(String name){
        this.name = name;
    }

    public Entry add(Entry entry){
        directory.add(entry);
        return this;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        int size = 0;
        Iterator it = directory.iterator();
        while (it.hasNext()){
            Entry entry = (Entry) it.next();
            size += entry.getSize();
        }
        return size;
    }
    @Override
    protected void printList(String prefix) {
        System.out.println(prefix+"/" + this);
        Iterator iterator = directory.iterator();
        while (iterator.hasNext()){
            Entry entry = (Entry) iterator.next();
            entry.printList(prefix + "/"+name);
        }
    }
}
