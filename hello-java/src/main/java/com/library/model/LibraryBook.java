package com.library.model;

public class LibraryBook {
    private String title;
    private String author;
    private int pageCount;
    private boolean checkedOut;

    public LibraryBook() {
        this("unknown", "unknown", 0);
    }

    public LibraryBook(String title, String author) {
        this(title, author, 0);
    }

    public LibraryBook(String title, String author, int pageCount) {
        setTitle(title);
        setAuthor(author);
        setPageCount(pageCount);
        setCheckedOut(false);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if (title == null || title.isBlank()) {
            throw new IllegalArgumentException("title must contain at least 1 symbol");
        }
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        if (author == null || author.isBlank()) {
            throw new IllegalArgumentException("author must contain at least 1 symbol");
        }
        this.author = author;
    }

    public int getPageCount() {
        return pageCount;
    }

    public void setPageCount(int pageCount) {
        if (pageCount < 0) {
            throw new IllegalArgumentException("number should be positive");
        }
        this.pageCount = pageCount;
    }

    public boolean isCheckedOut() {
        return checkedOut;
    }

    public void setCheckedOut(boolean checkedOut) {
        this.checkedOut = checkedOut;
    }

    public void checkOut() {
        if (checkedOut) {
            System.out.println("this book has been already checked out");

        } else {
            setCheckedOut(true);
        }
    }

    public void returnBook() {
        setCheckedOut(false);
    }

    @Override
    public String toString() {
        return String.format("Title: %s, author: %s, pages: %d, available: %b",
                title, author, pageCount, !checkedOut);
    }

}
