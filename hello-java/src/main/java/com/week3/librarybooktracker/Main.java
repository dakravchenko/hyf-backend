package com.week3.librarybooktracker;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        List<Pair<String, String>> books = new ArrayList<Pair<String, String>>();

        books.add(new Pair<String, String>("test", "a"));
        books.add(new Pair<String, String>("test2", "a"));
        books.add(new Pair<String, String>("test3", "b"));
        books.add(new Pair<String, String>("test4", "b"));
        books.add(new Pair<String, String>("test5", "c"));
        books.add(new Pair<String, String>("test6", "c"));

        Map<String, Integer> genresWithCount = new HashMap<String, Integer>();

        Set<String> genres = new HashSet<>();
        books.stream().forEach(book -> genres.add(book.getValue()));

        for (String genre : genres) {
            int count = (int) books.stream().filter(book -> book.getValue().equals(genre)).count();
            genresWithCount.put(genre, count);
        }

        System.out.println("Genre statistics:");

        genresWithCount.forEach((V, K) -> System.out.printf("%s: %d book(s)%n", V, K));
    }
}
