package com.library.service;

import com.library.model.Book;

public class LibraryService {
    public void printBook(Book book) {
        System.out.println(book.getTitle());
    }
}