package com.company.model;

public class Manager extends Employee {
    private int teamSize;

    public Manager(String name, String employeeId, double baseSalary, int teamSize) {
        super(name, employeeId, baseSalary);
        this.teamSize = teamSize;
    }

    @Override
    public double calculateMonthlyPay() {
        return getBaseSalary() + (teamSize * 200);
    }

    @Override
    public String toString() {
        return String.format("[%s], %s - Monthly: €%.2f (Manager of %d people)%n", getEmployeeId(), getName(),
                calculateMonthlyPay(), teamSize);
    }

}
