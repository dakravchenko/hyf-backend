package com.book;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "978-0743273565", 1925);
        Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", "978-0061120084", 1960);
        Book book3 = new Book("The Great Gatsby", "F. Scott Fitzgerald", "978-0743273565", 1925);

        System.out.println(book1);
        System.out.println(book2);
        System.out.println(book3);

        System.out.println("book1 equals book2: " + book1.equals(book2));
        System.out.println("book1 equals book3: " + book1.equals(book3));
    }
}
