package com.week1and2.delivery.interfaces;

public interface Trackable {
    String getTrackingId();

    String getCurrentStatus();

    static void printAllStatuses(Trackable[] items) {
        for (Trackable item : items) {
            System.out.println(item.getTrackingId());
        }
    }
}
