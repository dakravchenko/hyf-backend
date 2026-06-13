package com.week1and2.employee;

import com.week1and2.employee.model.Employee;

public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee("peter", "1", 0);
        Employee e2 = new Employee("oleg", "1", 0);

        System.out.println(e1);
        System.out.println(e2);

        System.out.println(e1 == e2);
        System.out.println(e1.equals(e2));
    }
}
