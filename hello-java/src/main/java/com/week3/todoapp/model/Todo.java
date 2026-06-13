package com.week3.todoapp.model;

public class Todo {
    private String description;
    private String name;
    private String status;

    public Todo(String name){
        this.name = name;
        this.description = "";
        this.status = "todo";
    }

    public Todo(String name, String description, String status){
        this.name = name;
        this.description = description;
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public String getName() {
        return name;
    }

    public String getStatus() {
        return status;
    }

}
