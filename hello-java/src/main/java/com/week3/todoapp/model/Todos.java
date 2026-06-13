package com.week3.todoapp.model;

import java.util.ArrayList;

public class Todos {
    private ArrayList<Todo> todos;

    public Todos(ArrayList<Todo> todos) {
        this.todos = todos;
    }

    public ArrayList<Todo> getTodos() {
        return todos;
    }

    public void addTask(String taskString) {
        Todo task = new Todo(taskString);
        todos.add(task);
    }

    public void removeTask(int index) {

        todos.remove(index);
    }

    public void displayAllTodos() {
        for (int i = 0; i < getSize(); i++) {
            System.out.println(i + " " + todos.get(i));
        }
    }

    public int getSize() {
        return todos.size();
    }

}
