package com.employee.model;

public class Employee {
    private String name;
    private String employeeId;
    private double salary;

    public Employee(String name, String id, double salary) {
        this.name = name;
        this.employeeId = id;
        this.salary = salary;

    }

    @Override
    public String toString() {
        return "name: " + name + "id: " + employeeId + "salary: " + salary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;
        if (!(o instanceof Employee))
            return false;
        Employee other = (Employee) o;
        return employeeId.equals(other.employeeId);
    }
}
