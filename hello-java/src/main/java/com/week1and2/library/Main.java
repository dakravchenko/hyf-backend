package com.week1and2.library;

import com.week1and2.library.model.LibraryBook;

public class Main {
    public static void main(String[] args) {
        // Book book = new Book("Harry Potter", "J.K. Rowling", "12345");
        // LibraryService service = new LibraryService();

        // service.printBook(book);

        LibraryBook book = new LibraryBook();

        System.out.println(book.toString());

        LibraryBook book2 = new LibraryBook("test", "test2");

        book2.checkOut();

        System.out.println(book2.toString());

        LibraryBook book3 = new LibraryBook("eurovision", "random author", 22);

        book3.checkOut();

        System.out.println(book3.toString());

        book3.returnBook();

        System.out.println(book3.toString());
    }
}