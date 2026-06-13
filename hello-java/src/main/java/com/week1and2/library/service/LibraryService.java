package com.week1and2.library.service;

import com.week1and2.library.model.Book;

public class LibraryService {
    public void printBook(Book book) {
        System.out.println(book.getTitle());
    }
}