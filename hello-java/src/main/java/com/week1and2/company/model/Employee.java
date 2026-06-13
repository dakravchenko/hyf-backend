package com.week1and2.company.model;

public class Employee {
    private String name;
    private String employeeId;
    private double baseSalary;

    public Employee(String name, String employeeId, double baseSalary) {
        this.name = name;
        this.employeeId = employeeId;
        this.baseSalary = baseSalary;
    }

    public String getName() {
        return name;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public double calculateMonthlyPay() {
        return baseSalary;
    }

    public String toString() {
        return String.format("[%s], %s - Monthly: €%.2f%n", employeeId, name, baseSalary);
    }

}
