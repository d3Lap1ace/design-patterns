package com.java.iterator;

import lombok.Data;

/**
 * @classname design-pattern
 * @Auther d3Lap1ace
 * @Time 1/1/2025 12:25 周三
 * @description
 * @Version 1.0
 * From the Laplace Demon
 */

@Data
public class BookShelf implements Aggregate{
    private Book[] books;
    private int last = 0;

    public BookShelf(int maxsize) {
        this.books = new Book[maxsize];
    }

    public Book getBookAt(int index) {
        return books[index];
    }

    public void appendBook(Book book){
        this.books[last] = book;
        last++;
    }

    @Override
    public Iterator getIterator() {
        return new BookShelfIterator(this);
    }
}
