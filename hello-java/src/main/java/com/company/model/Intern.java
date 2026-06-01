package com.company.model;

public class Intern extends Employee {
    private int durationMonths;

    public Intern(String name, String employeeId, double baseSalary, int durationMonths) {
        super(name, employeeId, baseSalary);
        this.durationMonths = durationMonths;
    }

    @Override
    public double calculateMonthlyPay() {
        return getBaseSalary() * 0.6;
    }

    @Override
    public String toString() {
        return String.format("[%s], %s - Monthly: €%.2f (Internship: %d months)%n", getEmployeeId(), getName(),
                calculateMonthlyPay(), durationMonths);
    }

}
