package com.java.abstrcit;

import java.nio.file.attribute.AttributeView;

/**
 * @classname Design-patterns
 * @Auther d3Lap1ace
 * @Time 5/15/2024 3:45 PM Wed
 * @description
 * @Version 1.0
 * From the Laplace Demon
 */


public class AbstrictFactoryExer {
    public static void main(String[] args) {
        Apple apple = new Apple();
        apple.creatNoteBook();
        apple.creatPhone();

        FSK fsk = new FSK();
        fsk.creatNoteBook();
        fsk.creatPhone();

    }
}



interface Phone{
    public void createPhone();
}
interface NoteBook{
    public void createNodeBook();
}

class Iphone implements Phone{
    @Override
    public void createPhone() {
        System.out.println("苹果手机");
    }
}
class HuaWeiPhone implements Phone{
    @Override
    public void createPhone() {
        System.out.println("华为手机");
    }
}

class Imac implements NoteBook{
    @Override
    public void createNodeBook() {
        System.out.println("mac");
    }
}
class Huipu implements NoteBook{
    @Override
    public void createNodeBook() {
        System.out.println("onea");
    }
}


interface AbstrictFactory{
    Phone creatPhone();
    NoteBook creatNoteBook();
}

class Apple implements AbstrictFactory{
    @Override
    public Phone creatPhone() {
        Phone iphone = new Iphone();
        System.out.println("苹果公司造的手机");
        return iphone;
    }

    @Override
    public NoteBook creatNoteBook() {
        NoteBook imac = new Imac();
        System.out.println("苹果公司造的笔记本");
        return imac;
    }
}

class FSK implements AbstrictFactory{
    @Override
    public Phone creatPhone() {
        Phone huaWeiPhone = new HuaWeiPhone();
        System.out.println("fsk的华为手机");
        return huaWeiPhone;
    }

    @Override
    public NoteBook creatNoteBook() {
        NoteBook omea = new Huipu();
        System.out.println("fsk的惠普");
        return omea;
    }
}

