package com.java.iterator;

/**
 * @classname design-pattern
 * @Auther d3Lap1ace
 * @Time 1/1/2025 12:27 周三
 * @description
 * @Version 1.0
 * From the Laplace Demon
 */


public class BookShelfIterator implements Iterator {
    private BookShelf bookShelf;
    private int index;
    public BookShelfIterator(BookShelf bookShelf) {
        this.bookShelf = bookShelf;
        index = 0;
    }

    @Override
    public boolean hasNext() {
        if(index < bookShelf.getLast()){
            return true;
        }else {
            return false;
        }
    }

    @Override
    public Object next() {
        Book books = bookShelf.getBookAt(index);
        index++;
        return books;
    }
}
