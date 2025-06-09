package com.java.designPattern;

import java.util.ArrayList;

/**
 * @classname design-patterns
 * @Auther d3Lap1ace
 * @Time 6/9/2025 10:25 PM Mon
 * @description
 * @Version 1.0
 * From the Laplace Demon
 */


public class Main {
    public static void main(String[] args) {
        try {
            Dirctory root = new Dirctory("root");
            Dirctory bin = new Dirctory("bin");
            Dirctory tmp = new Dirctory("tmp");
            Dirctory usr = new Dirctory("usr");
            root.add(bin);
            root.add(usr);
            root.add(tmp);
            root.add(new File("23",400));
            root.printList();
            int size = root.getSize();
            System.out.println("size = " + size);

            // ====================================
            bin.add(new File("vi",100));
            bin.add(new File("v2",1000));
            System.out.println("bin.getSize() = " + bin.getSize());
            usr.add(new File("usr",200));
            tmp.add(new File("tmp",300));

            root.printList();
        }catch (FileTreatmentException e){
            e.printStackTrace();
            System.out.println("File treatment exception");
        }
    }

}
