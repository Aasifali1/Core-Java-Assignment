package com.knoldus.kup.Core_Java.ques13;

public class Book {
    int bookId;
    String title;
    Book(int bookId, String title){
        this.bookId = bookId;
        this.title= title;
    }
    @Override
    public String toString() {
        return "Book{ " +
                "Book Id=" + bookId +
                ", Title=' " + title + '\'' +
                '}';
    }
}
