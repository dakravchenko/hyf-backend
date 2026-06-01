package com.delivery.interfaces;

public interface Insurable {
    double calculateInsurance();

    boolean isCovered();

    default String insuranceSummary() {
        if (isCovered()) {
            return String.format("Covered: YES | Premium: €%.2f%n", calculateInsurance());
        } else {
            return "Covered: NO";
        }
    }
}
