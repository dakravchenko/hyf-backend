package com.week3.todoapp;

import java.util.ArrayList;
import java.util.Scanner;
import com.week3.todoapp.model.Todos;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Todos todos = new Todos(new ArrayList<>());

        boolean running = true;
        while (running) {
            printMenu();
            System.out.print("Choose an option: ");
            String input = scanner.nextLine().trim();

            switch (input) {
                case "1":
                    System.out.print("Enter new task: ");
                    String task = scanner.nextLine().trim();
                    if (!task.isEmpty()) {
                        todos.addTask(task);
                        System.out.println("Task added.");
                    } else {
                        System.out.println("Task cannot be empty.");
                    }
                    break;

                case "2":
                    if (todos.getSize() == 0) {
                        System.out.println("No tasks to remove.");
                        break;
                    }
                    System.out.println("Current tasks:");
                    todos.displayAllTodos();
                    System.out.print("Enter index to remove: ");
                    String idxStr = scanner.nextLine().trim();
                    try {
                        int idx = Integer.parseInt(idxStr);
                        if (idx >= 0 && idx < todos.getSize()) {
                            String removed = todos.getTodos().get(idx).getName();
                            todos.removeTask(idx);
                            System.out.println("Removed: " + removed);
                        } else {
                            System.out.println("Index out of range.");
                        }
                    } catch (NumberFormatException e) {
                        System.out.println("Invalid index. Please enter a number.");
                    } catch (IndexOutOfBoundsException e) {
                        System.out.println("Index out of range.");
                    }
                    break;

                case "3":
                    if (todos.getSize() == 0) {
                        System.out.println("No tasks.");
                    } else {
                        System.out.println("All tasks:");
                        todos.displayAllTodos();
                    }
                    break;

                case "4":
                    System.out.println("Total tasks: " + todos.getSize());
                    break;

                case "5":
                case "q":
                case "exit":
                    running = false;
                    break;

                default:
                    System.out.println("Invalid option. Please choose 1-5.");
            }

            System.out.println();
        }

        System.out.println("Goodbye!");
        scanner.close();
    }

    private static void printMenu() {
        System.out.println("=== Todo Menu ===");
        System.out.println("1) Add task");
        System.out.println("2) Remove task by index");
        System.out.println("3) Display all tasks");
        System.out.println("4) Get total number of tasks");
        System.out.println("5) Exit");
    }
}