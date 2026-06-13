package com.week1and2.company;

import com.week1and2.company.model.Employee;
import com.week1and2.company.model.Intern;
import com.week1and2.company.model.Manager;

public class Main {
    public static void main(String[] args) {
        Employee emp = new Employee("Alice", "E001", 3000);
        Employee intern = new Intern("Bob", "I001", 2000, 6);
        Employee manager = new Manager("Charlie", "M001", 5000, 5);

        System.out.println(emp);
        System.out.println(intern);
        System.out.println(manager);
    }
}
