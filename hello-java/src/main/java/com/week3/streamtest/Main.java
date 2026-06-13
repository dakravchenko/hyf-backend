package com.week3.streamtest;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        List<String> names = List.of("Anna", "Bob", "Charlie", "Eve");

        Stream<String> shortNames = names.stream()
                .filter(name -> name.length() <= 3);
    
        System.out.println(shortNames);
    }
}
