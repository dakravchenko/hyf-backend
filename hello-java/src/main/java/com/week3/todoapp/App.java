package com.week3.todoapp;

import java.util.HashMap;

public class App {
    public static void main(String[] args) {
        HashMap<String, Integer> students = new HashMap<>();

        students.put("danya", 99);
        students.put("di", 98);
        students.put("ant", 98);

        System.out.println(students);

        
        System.out.println(students.get("di"));


    }
}
